package no.fk.model.metadata;

import java.util.Date;
import java.util.List;

public class Metadata {
	private long sakssekvensnummer;
	private long saksaar;
	private long journalaar;
	private long journalsekvensnummer;
	private long journalpostnummer;
	private String journalposttype;
	private String journalstatus;
	private Date journaldato;
	private Date dokumentetsDato;
	private String tittel;
	private String saksBehandler;
	private List<String> ekstraMetadata;

	public long getSakssekvensnummer() {
		return sakssekvensnummer;
	}

	public void setSakssekvensnummer(long sakssekvensnummer) {
		this.sakssekvensnummer = sakssekvensnummer;
	}

	public long getSaksaar() {
		return saksaar;
	}

	public void setSaksaar(long saksaar) {
		this.saksaar = saksaar;
	}

	public long getJournalaar() {
		return journalaar;
	}

	public void setJournalaar(long journalaar) {
		this.journalaar = journalaar;
	}

	public long getJournalsekvensnummer() {
		return journalsekvensnummer;
	}

	public void setJournalsekvensnummer(long journalsekvensnummer) {
		this.journalsekvensnummer = journalsekvensnummer;
	}

	public long getJournalpostnummer() {
		return journalpostnummer;
	}

	public void setJournalpostnummer(long journalpostnummer) {
		this.journalpostnummer = journalpostnummer;
	}

	public String getJournalposttype() {
		return journalposttype;
	}

	public void setJournalposttype(String journalposttype) {
		this.journalposttype = journalposttype;
	}

	public String getJournalstatus() {
		return journalstatus;
	}

	public void setJournalstatus(String journalstatus) {
		this.journalstatus = journalstatus;
	}

	public Date getJournaldato() {
		return journaldato;
	}

	public void setJournaldato(Date journaldato) {
		this.journaldato = journaldato;
	}

	public Date getDokumentetsDato() {
		return dokumentetsDato;
	}

	public void setDokumentetsDato(Date dokumentetsDato) {
		this.dokumentetsDato = dokumentetsDato;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public String getSaksBehandler() {
		return saksBehandler;
	}

	public void setSaksBehandler(String saksBehandler) {
		this.saksBehandler = saksBehandler;
	}

	public List<String> getEkstraMetadata() {
		return ekstraMetadata;
	}

	public void setEkstraMetadata(List<String> ekstraMetadata) {
		this.ekstraMetadata = ekstraMetadata;
	}

	@Override
	public String toString() {
		return "Metadata [sakssekvensnummer=" + sakssekvensnummer + ", saksaar=" + saksaar + ", journalaar="
				+ journalaar + ", journalsekvensnummer=" + journalsekvensnummer + ", journalpostnummer="
				+ journalpostnummer + ", journalposttype=" + journalposttype + ", journalstatus=" + journalstatus
				+ ", journaldato=" + journaldato + ", dokumentetsDato=" + dokumentetsDato + ", tittel=" + tittel
				+ ", saksBehandler=" + saksBehandler + ", ekstraMetadata=" + ekstraMetadata + "]";
	}

}
