package no.fk.model;

public class Filmetadata {
	private String filnavn;
	private String mimetype;

	public String getFilnavn() {
		return filnavn;
	}

	public void setFilnavn(String filnavn) {
		this.filnavn = filnavn;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	@Override
	public String toString() {
		return "Filmetadata [filnavn=" + filnavn + ", mimetype=" + mimetype + "]";
	}

}
