import java.util.Date;
import java.util.List;

public class TWypozyczenie {
	private int iloscDni;
	private Date poczatek;
	private Date koniec;
	
	private List<TPozycja> pozycje;
	public List<TPozycja> getPozycje() {
		return pozycje;
	}
	public void setPozycje(List<TPozycja> pozycje) {
		this.pozycje = pozycje;
	}
	private TKlient klient;
	private TFaktura faktura;
	
	public TWypozyczenie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIloscDni() {
		return iloscDni;
	}
	public void setIloscDni(int iloscDni) {
		this.iloscDni = iloscDni;
	}
	public Date getPoczatek() {
		return poczatek;
	}
	public void setPoczatek(Date poczatek) {
		this.poczatek = poczatek;
	}
	public Date getKoniec() {
		return koniec;
	}
	public void setKoniec(Date koniec) {
		this.koniec = koniec;
	}
	public TKlient getKlient() {
		return klient;
	}
	public void setKlient(TKlient klient) {
		this.klient = klient;
	}
	public TFaktura getFaktura() {
		return faktura;
	}
	public void setFaktura(TFaktura faktura) {
		this.faktura = faktura;
	}
	
}
