
public class TTytul {

	enum Gatunek {
		Animowany,
		Biograficzny,
		Komedia,
		Horror,
		Przygodowy,
		Sensacyjny,
		Kryminalny,
		Dokumentalny,
		Fabularny,
		Melodramat,
		Pornograficzny,
		Wojenny,
		Historyczny,
		Western;
		
		@Override
		public String toString(){
			return super.toString();
		}
	}
	
	private Gatunek gatunek;
	private String tytul;
	private short rokWydania;
	private String rezyser;
		
	public TTytul() {
		super();
	}
	public Gatunek getGatunek() {
		return gatunek;
	}
	public void setGatunek(Gatunek gatunek) {
		this.gatunek = gatunek;
	}
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public short getRokWydania() {
		return rokWydania;
	}
	public void setRokWydania(short rokWydania) {
		this.rokWydania = rokWydania;
	}
	public String getRezyser() {
		return rezyser;
	}
	public void setRezyser(String rezyser) {
		this.rezyser = rezyser;
	}
	
	@Override
	public String toString() {
		return "TTytul [tytul=" + tytul + ", gatunek=" + gatunek + ", rokWydania=" + rokWydania + ", rezyser=" + rezyser
				+ "]";
	}
}
