
public class TKlient {
	private String imie;
	private String nazwisko;
	private String adres;
	private byte[] PESEL;
	private String telefon;
	private String mail;
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public byte[] getPESEL() {
		return PESEL;
	}
	public void setPESEL(byte[] pESEL) {
		PESEL = pESEL;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	private byte obliczSumeKontrolna(byte[] PESEL)
	{
		return 0;
	}
}
