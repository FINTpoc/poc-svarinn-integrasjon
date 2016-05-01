package no.fk.transformer;

import no.fint.mule.ImportDocument;
import no.fk.model.Forsendelse;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class BluegardenImportTransformer extends AbstractMessageTransformer {

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {

        try {
            Forsendelse forsendelse = message.getInvocationProperty("forsendelse");

            ImportDocument importDocument = new ImportDocument();
            importDocument.setDocumentAuthor(forsendelse.getAvsender().getNavn());
            importDocument.setServiceAddress("http://localhost:8088");
            importDocument.setFodselsnummer(forsendelse.getMottaker().getFnr());
            importDocument.setSourceRef("");
            importDocument.setSourceUser("");
            importDocument.setDocumentName(forsendelse.getFilmetadata().get(0).getFilnavn());
            importDocument.setSourceCompany(forsendelse.getAvsender().getNavn());
            importDocument.setSourceEmployer(forsendelse.getAvsender().getNavn());
            importDocument.setFile(message.getPayloadAsBytes());

            return importDocument;
        } catch (Exception e) {
            throw new TransformerException(this, e);
        }
    }

}
