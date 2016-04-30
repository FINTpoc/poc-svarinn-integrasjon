package no.fk.transformers;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import no.fk.model.Forsendelse;

public class ForsendelseTransformer extends AbstractMessageTransformer {
		
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		String payload = message.getPayload(String.class);
		System.out.println(payload);
		
		return new Forsendelse();
	}
}