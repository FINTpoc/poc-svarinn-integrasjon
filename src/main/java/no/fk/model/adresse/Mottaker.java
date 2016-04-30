package no.fk.model.adresse;

public class Mottaker {
	private String adresse1;
	private String adresse2;
	private String adresse3;
	private String navn;
	private String postnr;
	private String poststed;
	private String land;
	private String orgnr;
	private String fnr;

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getAdresse3() {
		return adresse3;
	}

	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getPostnr() {
		return postnr;
	}

	public void setPostnr(String postnr) {
		this.postnr = postnr;
	}

	public String getPoststed() {
		return poststed;
	}

	public void setPoststed(String poststed) {
		this.poststed = poststed;
	}

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
		return "Mottaker [adresse1=" + adresse1 + ", adresse2=" + adresse2 + ", adresse3=" + adresse3 + ", navn="
				+ navn + ", postnr=" + postnr + ", poststed=" + poststed + ", land=" + land + ", orgnr=" + orgnr
				+ ", fnr=" + fnr + "]";
	}

}
