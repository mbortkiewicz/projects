import java.util.List;

public class TKartoteka {
	private List<TKlient> klienci;
	
	public TKartoteka()
	{
		super();
	}
	
	public TKlient szukaj_TKlienta(TKlient klient) 
	{
		for(TKlient k : klienci)
		{
			if(k.equals(klient))
				return k;
		}
		return null;
	}
	
	public TKlient dodaj_TKlienta(Object[] data)
	{
		TFabryka fabryka = new TFabryka();
		TKlient klient = fabryka.nowyKlient(data);
		
		return dodaj_TKlienta(klient);
	}
	
	public TKlient dodaj_TKlienta(TKlient klient)
	{
		if(szukaj_TKlienta(klient) != null)
			return null;
		
		klienci.add(klient);
		return klient;
	}

}
