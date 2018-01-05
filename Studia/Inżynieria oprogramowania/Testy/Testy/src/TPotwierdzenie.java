import java.util.Date;

public class TPotwierdzenie {
	TKlient klient;
	Date data;
	TWypozyczenie wypozyczenie;
	float kwota;
	
	public TPotwierdzenie() {
		super();
		// TODO Auto-generated constructor stub
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
	public TWypozyczenie getWypozyczenie() {
		return wypozyczenie;
	}
	public void setWypozyczenie(TWypozyczenie wypozyczenie) {
		this.wypozyczenie = wypozyczenie;
	}
	public float getKwota() {
		return kwota;
	}
	public void setKwota(float kwota) {
		this.kwota = kwota;
	}
}
