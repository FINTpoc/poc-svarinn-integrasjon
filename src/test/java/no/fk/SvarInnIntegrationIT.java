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
    public void noNewShipments() throws Exception {
        runFlow(Flows.SVARINN, testEvent("[]".getBytes()));
        verifyCallOfMessageProcessor("request").ofNamespace("http").times(0);
    }

    @Test
    public void newShipment() throws Exception {
        Forsendelse forsendelse1 = new Forsendelse();
        forsendelse1.setId("123");

        Forsendelse forsendelse2 = new Forsendelse();
        forsendelse2.setId("234");

        String content = new ObjectMapper().writeValueAsString(Lists.newArrayList(forsendelse1, forsendelse2));
        whenMessageProcessor("request").ofNamespace("http").thenReturn(muleMessageWithPayload("test"));

        MuleEvent muleEvent = runFlow(Flows.SVARINN, testEvent(content.getBytes()));

        verifyCallOfMessageProcessor("request").ofNamespace("http").times(4);
        assertEquals(2, muleEvent.getMessage().getPayload(Forsendelse[].class).length);
    }


}
