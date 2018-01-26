package mypackage;

import java.util.Date;

public class TFaktura {

	private float kwotaNetto;
	private float kwotaButto;
	private TKlient klient;
	private TWypozyczenie wypozyczenie;
	
	public TWypozyczenie getWypozyczenie() {
		return wypozyczenie;
	}
	public void setWypozyczenie(TWypozyczenie wypozyczenie) {
		this.wypozyczenie = wypozyczenie;
	}
	private Date data;
	
	public float getKwotaNetto() {
		return kwotaNetto;
	}
	public void setKwotaNetto(float kwotaNetto) {
		this.kwotaNetto = kwotaNetto;
	}
	public float getKwotaButto() {
		return kwotaButto;
	}
	public void setKwotaButto(float kwotaButto) {
		this.kwotaButto = kwotaButto;
	}
	public TKlient getKlient() {
		return klient;
	}
	public void setKlient(TKlient klient) {
		this.klient = klient;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
