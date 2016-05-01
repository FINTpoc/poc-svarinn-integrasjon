package no.fk.model.adresse;

import no.fk.model.adresse.Adresse;

public class SvarSendesTil extends Adresse {
	private String land;
	private String orgnr;
	private String fnr;

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

	public String getFnr() {
		return fnr;
	}

	public void setFnr(String fnr) {
		this.fnr = fnr;
	}

	@Override
	public String toString() {
		return "SvarSendesTil [land=" + land + ", orgnr=" + orgnr + ", fnr=" + fnr + "]";
	}

}
