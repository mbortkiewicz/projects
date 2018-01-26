package mypackage;

import java.util.ArrayList;
import java.util.List;

public class TMagazyn {

	private List<TProdukt> produkty;
	private List<TTytul> tytuly;
	
        public TMagazyn(){
            produkty = new ArrayList();
            tytuly = new ArrayList();
        }
        
	public TProdukt szukaj_TProdukt(TProdukt produkt)
	{
		for(TProdukt p : produkty)
		{
			if(p.equals(produkt))
				return p;
		}
		return null;
	}
	public TTytul szukaj_TTytul(TTytul tytul)
	{
		for(TTytul t : tytuly)
		{
			if(t.equals(tytul))
				return t;
		}
		return null;
	}
	public TProdukt dodaj_TProdukt(Object[] data)
	{
		TFabryka fabryka = new TFabryka();
		TProdukt produkt = fabryka.nowyProdukt(data);
		
		if(produkt.getTytul() == null)
			return null;
		
		produkty.add(produkt);
		return produkt;
	}
	public TTytul dodaj_TTytul(Object[] data)
	{
		TFabryka fabryka = new TFabryka();
		TTytul tytul = fabryka.nowyTytul(data);
		
		if(tytul.getTytul() == null)
			return null;
		
		tytuly.add(tytul);
		return tytul;
	}
	public void drukuj_TProdukty()
	{
		for(TProdukt p : produkty){
			if(p.getAktywny())
				System.out.println(p.toString());			
		}
	}
	public void drukuj_TTytuly()
	{
		for(TTytul t : tytuly)
			System.out.println(t.toString());
	}
	public boolean sprawdz_dostepnosc(TProdukt produkt)
	{
		produkt = szukaj_TProdukt(produkt);
		if(produkt == null)
			return false;
		return !produkt.getWypozyczony();
	}
	
}
