
public class TPozycja {
	private TProdukt produkt;
	private float stawka;
	private boolean oddane;
	
	public boolean isOddane() {
		return oddane;
	}
	public void setOddane(boolean oddane) {
		this.oddane = oddane;
	}
	public TPozycja() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TProdukt getProdukt() {
		return produkt;
	}
	public void setProdukt(TProdukt produkt) {
		this.produkt = produkt;
	}
	public float getStawka() {
		return stawka;
	}
	public void setStawka(float stawka) {
		this.stawka = stawka;
	}	
}
