package no.fk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import no.fk.model.Forsendelse;
import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.munit.runner.functional.FunctionalMunitSuite;

import static org.junit.Assert.assertEquals;

public class SvarInnIntegrationIT extends FunctionalMunitSuite {


    @Test
    public void newMessages() throws Exception {
        Forsendelse forsendelse = new Forsendelse();
        forsendelse.setId("abc123");
        String content = new ObjectMapper().writeValueAsString(Lists.newArrayList(forsendelse));

        MuleEvent muleEvent = runFlow(Flows.SVARINN, testEvent(content.getBytes()));
        Forsendelse result = muleEvent.getMessage().getPayload(Forsendelse[].class)[0];

        assertEquals("abc123", result.getId());
    }


}
