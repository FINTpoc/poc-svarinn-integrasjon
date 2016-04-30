package no.fk.model;

import no.fk.model.adresse.Avsender;
import no.fk.model.adresse.Mottaker;
import no.fk.model.metadata.SvarSendesTil;
import no.fk.model.metadata.MetadataForImport;
import no.fk.model.metadata.MetadataFraAvleverendeSystem;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.*;

public class ForsendelseTest {

	@Test
	public void generateJson() throws JsonProcessingException {
		Forsendelse forsendelse = new Forsendelse();
		forsendelse.setId("AAAAAAA-AAAA-AAAA-AAAA-AAAAAAAAAAAA");
		forsendelse.setSvarPaForsendelse("BBBBBB-BBBB-CCCC-BBBB-BBBBBBBBBB");
		forsendelse.setEksternRef("en ref fra avsender");
		forsendelse.setForsendelseType("forsendelseType sett av avsender(heter dokumentType i v5 av servicen)");
		forsendelse.setTittel("En tittel");
		forsendelse.setDate(1412668736853L);
		forsendelse
				.setDownloadUrl("https://svarut.ks.no/tjenester/svarinn/forsendelse/AAAAAAA-AAAA-AAAA-AAAA-AAAAAAAAAAAA");
		forsendelse.setNiva("3");
		forsendelse.setStatus("Akseptert");

		Avsender avsender = new Avsender();
		avsender.setAdresselinje1("Forste adresselinje");
		avsender.setAdresselinje2("Andre adresselinje");
		avsender.setAdresselinje3("Tredje adresselinje");
		avsender.setNavn("Tester testmann");
		avsender.setPoststed("Teststad");
		avsender.setPostnr("3333");
		forsendelse.setAvsender(avsender);

		Mottaker mottaker = new Mottaker();
		mottaker.setAdresse1("Forste adresselinje");
		mottaker.setAdresse2("Andre adresselinje");
		mottaker.setAdresse3(null);
		mottaker.setPostnr("5258");
		mottaker.setPoststed("Blomsterdalen");
		mottaker.setNavn("Orgnavn");
		mottaker.setLand("Norge");
		mottaker.setOrgnr("999888777");
		forsendelse.setMottaker(mottaker);

		SvarSendesTil svarSendesTil = new SvarSendesTil();
		svarSendesTil.setAdresselinje1("Forste adresselinje");
		svarSendesTil.setAdresselinje2("Andre adresselinje");
		svarSendesTil.setAdresselinje3(null);
		svarSendesTil.setPostnr("5258");
		svarSendesTil.setPoststed("Blomsterdalen");
		svarSendesTil.setNavn("Orgnavn");
		svarSendesTil.setLand("Norge");
		svarSendesTil.setOrgnr("999888777");
		forsendelse.setSvarSendesTil(svarSendesTil);

		MetadataFraAvleverendeSystem metadataFraAvleverendeSystem = new MetadataFraAvleverendeSystem();
		metadataFraAvleverendeSystem.setSakssekvensnummer(0);
		metadataFraAvleverendeSystem.setSaksaar(0);
		metadataFraAvleverendeSystem.setJournalaar(0);
		metadataFraAvleverendeSystem.setJournalsekvensnummer(0);
		metadataFraAvleverendeSystem.setJournalpostnummer(0);
		metadataFraAvleverendeSystem.setJournalposttype("U");
		metadataFraAvleverendeSystem.setJournalstatus(null);
		metadataFraAvleverendeSystem.setJournaldato(null);
		metadataFraAvleverendeSystem.setDokumentetsDato(null);
		metadataFraAvleverendeSystem.setTittel(null);
		forsendelse.setMetadataFraAvleverendeSystem(metadataFraAvleverendeSystem);

		MetadataForImport metadataForImport = new MetadataForImport();
		metadataForImport.setSakssekvensnummer(0);
		metadataForImport.setSaksaar(0);
		metadataForImport.setJournalaar(0);
		metadataForImport.setJournalsekvensnummer(0);
		metadataForImport.setJournalpostnummer(0);
		metadataForImport.setJournalposttype("U");
		metadataForImport.setJournalstatus(null);
		metadataForImport.setJournaldato(null);
		metadataForImport.setDokumentetsDato(null);
		metadataForImport.setTittel(null);
		forsendelse.setMetadataForImport(metadataForImport);

		Filmetadata filmetadata = new Filmetadata();
		filmetadata.setFilnavn("dokument-d1c6d795.pdf");
		filmetadata.setMimetype("application/pdf");
		forsendelse.addFilmetadata(filmetadata);

		String json = new ObjectMapper().writeValueAsString(forsendelse);

		assertNotNull(json);
	}
}
