package Stigespillet;

public class Spiller {
	
	private String navn;
    private int poeng;
    private Brikke brikke;

    public Spiller(String navn, Brikke brikke) {
        this.setNavn(navn);
        this.setBrikke(brikke);
        this.setPoeng(0);
    }

    public String getNavn() {
    return navn;
}

    public Brikke getBrikke() {
    return brikke;
}

    public int getPoeng() {
    return poeng;
}

    public void leggTilPoeng(int poeng) {
    this.setPoeng(this.getPoeng() + poeng);
}

    public void nesteTrekk(Spiller spillere) {
    // Kast terningen
    int verdi = spillere.kast();

    // Flytt brikken
    Brett brett = new Brett();
    brett.flyttBrikke(getBrikke(), verdi);
}

	public void setBrikke(Brikke brikke) {
		this.brikke = brikke;
	}

	public void setPoeng(int poeng) {
		this.poeng = poeng;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	
	
}
