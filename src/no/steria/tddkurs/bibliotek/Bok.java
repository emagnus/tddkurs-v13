package no.steria.tddkurs.bibliotek;

public class Bok {

	private final String tittel;
	private final String forfatter;
	private final int antallSider;

	public Bok(String tittel, String forfatter, int antallSider) {
		this.tittel = tittel;
		this.forfatter = forfatter;
		this.antallSider = antallSider;
	}
	
	public String getForfatter() {
		return forfatter;
	}
	
	public String getTittel() {
		return tittel;
	}
	
	public int getAntallSider() {
		return antallSider;
	}
	
}
