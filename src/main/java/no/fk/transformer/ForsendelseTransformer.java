package no.fk.transformer;

import no.fk.model.Forsendelse;

public class ForsendelseTransformer {
		
	public Forsendelse transform(String json) {
		System.out.println("transform:" + json);
		return new Forsendelse();
	}
}