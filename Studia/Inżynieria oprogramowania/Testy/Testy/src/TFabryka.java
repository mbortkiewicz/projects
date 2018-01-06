import java.util.Date;
import java.util.List;

public class TFabryka {

	public TTytul nowyTytul(Object[] data)
	{
		TTytul tytul = new TTytul();
		
		tytul.setGatunek((TTytul.Gatunek)data[0]);
		tytul.setTytul((String)data[1]);
		tytul.setRokWydania((short)data[2]);
		tytul.setRezyser((String)data[3]);
		
		return tytul;
	}
	
	public TProdukt nowyProdukt(Object[] data)
	{
		TProdukt produkt = new TProdukt();
		
		produkt.setTytul((TTytul)data[0]);
		produkt.setRef((int)data[1]);
		produkt.setStawka((float)data[2]);
		produkt.setAktywny((boolean)data[3]);
		produkt.setNosnik((TProdukt.Nosnik)data[4]);
		produkt.setWypozyczony(false);
		
		return produkt;
	}
	
	public TKlient nowyKlient(Object[] data) throws Exception
	{
		TKlient klient = new TKlient();
		
		klient.setImie((String)data[0]);
		klient.setNazwisko((String)data[1]);
		klient.setAdres((String)data[2]);
                if(data[3] != null && klient.obliczSumeKontrolna((byte[])data[3]) != ((byte[])data[3])[10])
                    throw new Exception("Podano niewłaściwy pesel");
		klient.setPESEL((byte[])data[3]);
		klient.setTelefon((String)data[4]);
		klient.setMail((String)data[5]);
		
		return klient;
	}
	
	public TFaktura nowaFaktura(Object[] data)
	{
		TFaktura faktura = new TFaktura();
		
		faktura.setKwotaNetto((float) data[0]);
		faktura.setKwotaButto((float) data[1]);
		faktura.setKlient((TKlient) data[2]);
		faktura.setWypozyczenie((TWypozyczenie) data[3]);
		faktura.setData((Date) data[4]);
		
		return faktura;
	}
	
	public TWypozyczenie noweWypozyczenie(Object[] data)
	{
		TWypozyczenie wypozyczenie = new TWypozyczenie();
		
		wypozyczenie.setIloscDni((int) data[0]); 
		wypozyczenie.setPoczatek((Date) data[1]);
		wypozyczenie.setKoniec((Date) data[2]);
		wypozyczenie.setPozycje((List<TPozycja>) data[3]);
		wypozyczenie.setKlient((TKlient) data[4]);
		wypozyczenie.setFaktura((TFaktura) data[5]);
		
		return wypozyczenie;
	}
	
	public TPozycja nowaPozycja(Object[] data)
	{
		TPozycja pozycja = new TPozycja();
		
		pozycja.setProdukt((TProdukt) data[0]);
		pozycja.setStawka((float) data[1]);
		pozycja.setOddane((boolean) data[2]);
		
		return pozycja;
	}
	
	public TPotwierdzenie nowePotwierdzenie(Object[] data)
	{
		TPotwierdzenie potwierdzenie = new TPotwierdzenie();
		
		potwierdzenie.setData((Date) data[0]);
		potwierdzenie.setKlient((TKlient) data[1]);
		potwierdzenie.setKwota((float) data[2]);
		potwierdzenie.setWypozyczenie((TWypozyczenie) data[3]);
		
		return potwierdzenie;
	}
}
