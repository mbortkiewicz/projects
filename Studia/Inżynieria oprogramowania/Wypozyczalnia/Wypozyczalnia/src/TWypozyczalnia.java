import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TWypozyczalnia {

	private TKartoteka kartoteka;
	private TMagazyn magazyn;
	private List<TFaktura> faktury;
	private List<TWypozyczenie> wypozyczenia;
	
	public TWypozyczalnia()
	{
		super();
	}
	
	public static void main(String[] t)
	{
		return;
	}
	
	public boolean zwrot(TKlient klient, TProdukt[] produkty)
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
	
	public boolean wypozyczenie(TKlient klient, TProdukt[] produkty, int ilosc_dni)
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
			dostepnosc = magazyn.sprawdz_dostepnosc(produkty[i]);
			
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
	
	public TWypozyczenie szukaj_TWypozyczenie(TProdukt produkt, TKlient klient)
	{
		return null;
	}
	
	public boolean przyjmij_towar(TProdukt[] produkty, TWypozyczenie wypozyczenie)
	{
		return false;
	}
	
	private boolean produkt_na_pozycji(TPozycja pozycja, TProdukt[] Produkty)
	{
		return false;
	}
}
