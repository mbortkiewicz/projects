package mypackage;


public class TKalkulator {
	private float pamiec = 0;
	
	public float oblicz_stawke(int ilosc_dni, float stawka)
	{
		pamiec += ilosc_dni * stawka;
		return ilosc_dni * stawka;
	}
	
	public float getPamiec()
	{
		return pamiec;
	}
	
	public void resetPamiec()
	{
		pamiec = 0;
	}
}
