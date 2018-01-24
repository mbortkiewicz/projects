package mypackage;


public class TProdukt {

    private Exception Exception(String nie_znaleziono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public enum Nosnik {
		VHS,
		DVD,
		Bluray;
		
		@Override
		public String toString(){
			return super.toString();
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ref;
		return result;
	}

	@Override
	public String toString() {
		return "TProdukt [ref=" + ref + ", tytul=" + tytul + ", stawka=" + stawka + ", nosnik=" + nosnik
				+ ", wypozyczony=" + wypozyczony + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TProdukt other = (TProdukt) obj;
		if (ref != other.ref)
			return false;
		return true;
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
	public boolean getWypozyczony(){
		return wypozyczony;
	}
	public boolean getAktywny(){
		return aktywny;
	}
}
