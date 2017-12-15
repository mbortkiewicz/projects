
public class TProdukt {
	
	enum Nosnik {
		VHS,
		DVD,
		Bluray
	}
	
	private TTytul tytul;
	private int ref;
	private float stawka;
	private boolean aktywny;
	private Nosnik nosnik;
	private boolean wypozyczony;
		
	public TProdukt() {
		super();
	}
	
	public boolean isWypozyczony() {
		return wypozyczony;
	}
	public void setWypozyczony(boolean wypozyczony) {
		this.wypozyczony = wypozyczony;
	}
	public TTytul getTytul() {
		return tytul;
	}
	public void setTytul(TTytul tytul) {
		this.tytul = tytul;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public float getStawka() {
		return stawka;
	}
	public void setStawka(float stawka) {
		this.stawka = stawka;
	}
	public boolean isAktywny() {
		return aktywny;
	}
	public void setAktywny(boolean aktywny) {
		this.aktywny = aktywny;
	}
	public Nosnik getNosnik() {
		return nosnik;
	}
	public void setNosnik(Nosnik nosnik) {
		this.nosnik = nosnik;
	}
}
