import java.util.*;

public class TKlient {
	private String imie;
	private String nazwisko;
	private String adres;
	private byte[] PESEL;
	private String telefon;
	private String mail;
	private List<TPotwierdzenie> potwierdzenia;
	
	public String getImie() {
		return imie;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(PESEL);
		return result;
	}
	@Override
	public String toString() {
		return "Klient [imie=" + imie + ", nazwisko=" + nazwisko + ", adres=" + adres + ", PESEL="
				+ Arrays.toString(PESEL) + ", telefon=" + telefon + ", mail=" + mail + ", potwierdzenia="
				+ potwierdzenia + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		TKlient other = (TKlient) obj;
		
		// jako pierwsze porównuejmy pesele
		if (other.PESEL != null && !Arrays.equals(PESEL, other.PESEL))
			return false;
		
		// porownujemy imie i nazwisko
		if (imie != null && !imie.toLowerCase().equals(other.imie.toLowerCase()))
			return false;
		else if (nazwisko != null && !nazwisko.toLowerCase().equals(other.nazwisko.toLowerCase()))
			return false;
		else if (nazwisko != null && imie != null && other.nazwisko != null && other.imie != null)
			return true;
		
		//porownujemy telefon
		if (telefon != null && other.telefon != null && telefon.equals(other.telefon)) 
			return true;
		
		return false;
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
	public void setPESEL(byte[] pesel) {
		PESEL = pesel;
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
		int suma = PESEL[0] + PESEL[4] + PESEL[8] +
				3 * (PESEL[1] + PESEL[5] + PESEL[9]) + 
				7 * (PESEL[2] + PESEL[6]) +
				9 * (PESEL[3] + PESEL[7]);
				
		return 0;
	}
	
	public void dodaj_potwierdzenie(TPotwierdzenie potwierdzenie)
	{
		potwierdzenia.add(potwierdzenie);
	}
}
