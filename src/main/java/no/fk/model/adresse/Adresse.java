package no.fk.model.adresse;

public abstract class Adresse {
	private String adresselinje1;
	private String adresselinje2;
	private String adresselinje3;
	private String navn;
	private String postnr;
	private String poststed;

	public String getAdresselinje1() {
		return adresselinje1;
	}

	public void setAdresselinje1(String adresselinje1) {
		this.adresselinje1 = adresselinje1;
	}

	public String getAdresselinje2() {
		return adresselinje2;
	}

	public void setAdresselinje2(String adresselinje2) {
		this.adresselinje2 = adresselinje2;
	}

	public String getAdresselinje3() {
		return adresselinje3;
	}

	public void setAdresselinje3(String adresselinje3) {
		this.adresselinje3 = adresselinje3;
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

}
