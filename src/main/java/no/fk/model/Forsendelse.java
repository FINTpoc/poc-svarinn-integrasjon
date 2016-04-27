package no.fk.model;

import java.util.ArrayList;
import java.util.List;

import no.fk.model.adresse.Avsender;
import no.fk.model.adresse.Mottaker;
import no.fk.model.adresse.SvarSendestil;
import no.fk.model.metadata.MetadataForImport;
import no.fk.model.metadata.MetadataFraAvleverendeSystem;

public class Forsendelse {
	private Avsender avsender;
	private Mottaker mottaker;
	private SvarSendestil svarSendestil;

	private String id;
	private String svarPaForsendelse;
	private String eksternRef;
	private String forsendelseType;
	private String tittel;
	private long date;
	private String downloadUrl;
	private String niva;
	private String status;

	private MetadataFraAvleverendeSystem metadataFraAvleverendeSystem;
	private MetadataForImport metadataForImport;
	private List<Filmetadata> filmetadata = new ArrayList<>();

	public Avsender getAvsender() {
		return avsender;
	}

	public void setAvsender(Avsender avsender) {
		this.avsender = avsender;
	}

	public Mottaker getMottaker() {
		return mottaker;
	}

	public void setMottaker(Mottaker mottaker) {
		this.mottaker = mottaker;
	}

	public SvarSendestil getSvarSendestil() {
		return svarSendestil;
	}

	public void setSvarSendestil(SvarSendestil svarSendestil) {
		this.svarSendestil = svarSendestil;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSvarPaForsendelse() {
		return svarPaForsendelse;
	}

	public void setSvarPaForsendelse(String svarPaForsendelse) {
		this.svarPaForsendelse = svarPaForsendelse;
	}

	public String getEksternRef() {
		return eksternRef;
	}

	public void setEksternRef(String eksternRef) {
		this.eksternRef = eksternRef;
	}

	public String getForsendelseType() {
		return forsendelseType;
	}

	public void setForsendelseType(String forsendelseType) {
		this.forsendelseType = forsendelseType;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getNiva() {
		return niva;
	}

	public void setNiva(String niva) {
		this.niva = niva;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MetadataFraAvleverendeSystem getMetadataFraAvleverendeSystem() {
		return metadataFraAvleverendeSystem;
	}

	public void setMetadataFraAvleverendeSystem(MetadataFraAvleverendeSystem metadataFraAvleverendeSystem) {
		this.metadataFraAvleverendeSystem = metadataFraAvleverendeSystem;
	}

	public MetadataForImport getMetadataForImport() {
		return metadataForImport;
	}

	public void setMetadataForImport(MetadataForImport metadataForImport) {
		this.metadataForImport = metadataForImport;
	}

	public List<Filmetadata> getFilmetadata() {
		return filmetadata;
	}

	public void setFilmetadata(List<Filmetadata> filmetadata) {
		this.filmetadata = filmetadata;
	}

	public void addFilmetadata(Filmetadata filmetadata) {
		this.filmetadata.add(filmetadata);
	}

	@Override
	public String toString() {
		return "Forsendelse [avsender=" + avsender + ", mottaker=" + mottaker + ", svarSendestil=" + svarSendestil
				+ ", id=" + id + ", svarPaForsendelse=" + svarPaForsendelse + ", eksternRef=" + eksternRef
				+ ", forsendelseType=" + forsendelseType + ", tittel=" + tittel + ", date=" + date + ", downloadUrl="
				+ downloadUrl + ", niva=" + niva + ", status=" + status + ", metadataFraAvleverendeSystem="
				+ metadataFraAvleverendeSystem + ", metadataForImport=" + metadataForImport + ", filmetadata="
				+ filmetadata + "]";
	}

}
