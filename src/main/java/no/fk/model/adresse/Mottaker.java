package no.fk.model.adresse;

public class Mottaker extends Adresse {
	private String land;
	private String orgnr;

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getOrgnr() {
		return orgnr;
	}

	public void setOrgnr(String orgnr) {
		this.orgnr = orgnr;
	}

	@Override
	public String toString() {
		return "Mottaker [land=" + land + ", orgnr=" + orgnr + "]";
	}

}
