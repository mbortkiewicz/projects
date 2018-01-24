package mypackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

public class TWypozyczalnia {

	public TKartoteka kartoteka;
	public TMagazyn magazyn;
	private List<TFaktura> faktury;
	private List<TWypozyczenie> wypozyczenia;
	
	public TWypozyczalnia()
	{
		super();
                kartoteka = new TKartoteka();
                magazyn = new TMagazyn();
                faktury = new ArrayList();
                wypozyczenia = new ArrayList();
	}
	
	public static void main(String[] t) throws Exception
	{
		return;
	}
	
	public boolean zwrot(TKlient klient, TProdukt[] produkty) throws Exception
	{
		TWypozyczenie wypozyczenie = szukaj_TWypozyczenie(produkty[0], klient);
		
		if(wypozyczenie == null)
			return false;
		else
		{
			przyjmij_towar(produkty, wypozyczenie);
			return true;
		}
	}
	
	public boolean wypozyczenie(TKlient klient, TProdukt[] produkty, int ilosc_dni) throws Exception
	{
		TKlient nowyKlient;
		TKalkulator kalkulator = new TKalkulator(); 
		TFabryka fabryka = new TFabryka();
		TWypozyczenie wypozyczenie;
		TFaktura faktura;
		
		boolean dostepnosc;
		float kwota;
		
		for(int i=0; i < produkty.length; i++)
		{
			dostepnosc = !magazyn.sprawdz_dostepnosc(produkty[i]);
			
			if(dostepnosc == false) return false;
		}
		
		nowyKlient = kartoteka.szukaj_TKlienta(klient);		
		
		if(nowyKlient == null)
		{
			nowyKlient = kartoteka.dodaj_TKlienta(klient);
		}
		
		for(int i =0; i < produkty.length; i++)
		{
			kalkulator.oblicz_stawke(ilosc_dni, produkty[i].getStawka());
		}
		
		kwota = kalkulator.getPamiec();

		List<TPozycja> pozycje = new ArrayList<TPozycja>();
		for(int i=0; i < produkty.length; i++)
		{
			pozycje.add(fabryka.nowaPozycja(new Object[]{produkty[0], produkty[0].getStawka(), false}));
		}
		
		wypozyczenie = fabryka.noweWypozyczenie(new Object[]{ilosc_dni, Calendar.getInstance().getTime(), null, pozycje, nowyKlient, null});
		
		faktura = fabryka.nowaFaktura(new Object[]{100*kwota/123, kwota, nowyKlient, wypozyczenie, wypozyczenie.getPoczatek()});
		
		wypozyczenie.setFaktura(faktura);
		
		faktury.add(faktura);
		wypozyczenia.add(wypozyczenie);
			
		return true;
	}
	
	public TFaktura szukaj_TFakture(TFaktura faktura)
	{
		return null;
	}
	
	public TWypozyczenie szukaj_TWypozyczenie(TProdukt produkt, TKlient klient) throws Exception
	{
		produkt = magazyn.szukaj_TProdukt(produkt);
		
		if(produkt==null) 
		{
			klient = kartoteka.szukaj_TKlienta(klient);
			if(klient==null)
			{
				return null;
			}
		}
		
		for(TWypozyczenie wypozyczenie : wypozyczenia)
		{
                    throw new Exception(wypozyczenie.getKoniec() == null ? "null" : "inne");
			/*if(wypozyczenie.getKoniec()==null) 
			{
				if(produkt != null)
				{
					for(TPozycja pozycja : wypozyczenie.getPozycje())
					{
						if(pozycja.getProdukt().equals(produkt))
							return wypozyczenie;
					}					
				}
				else if(klient != null && wypozyczenie.getKlient() == klient)
					return wypozyczenie;
			}*/
		}
                throw new Exception("nie ma");
		//return null;
	}
	
	public boolean przyjmij_towar(TProdukt[] produkty, TWypozyczenie wypozyczenie)
	{
		TKalkulator kalkulator = new TKalkulator();
		TFabryka fabryka = new TFabryka();
		int przetrzymanie = daysBetween(Calendar.getInstance().getTimeInMillis(), wypozyczenie.getPoczatek().getTime()) - wypozyczenie.getIloscDni();
		float kwota;
		if (przetrzymanie > 0)
		{
			for(TPozycja pozycja : wypozyczenie.getPozycje())
			{
				if(produkt_na_pozycji(pozycja, produkty) && pozycja.getStawka() > 0)
				{
					kalkulator.oblicz_stawke(przetrzymanie, pozycja.getStawka());
				}
			}
			
			kwota = kalkulator.getPamiec();
			TPotwierdzenie potwierdzenie = fabryka.nowePotwierdzenie(new Object[]{Calendar.getInstance().getTimeInMillis(), 
																					wypozyczenie.getKlient(), 
																					kwota, 
																					wypozyczenie});
			
			wypozyczenie.getKlient().dodaj_potwierdzenie(potwierdzenie);
			
			for(TPozycja pozycja : wypozyczenie.getPozycje())
			{
				boolean produkt = produkt_na_pozycji(pozycja, produkty);
				if(produkt)
				{
					pozycja.setOddane(true);
					pozycja.getProdukt().setWypozyczony(false);
				}
			}		
		}
		
		return true;
	}
	
	private boolean produkt_na_pozycji(TPozycja pozycja, TProdukt[] produkty)
	{
		for(TProdukt p : produkty)
		{
			if(p.equals(pozycja.getProdukt()))
				return true;			
		}
		return false;
	}
	
	private int daysBetween(long t1, long t2) {
	    return (int) ((t2 - t1) / (1000 * 60 * 60 * 24));
	} 
}
