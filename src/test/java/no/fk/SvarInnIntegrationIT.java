package no.fk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import no.fk.model.Filmetadata;
import no.fk.model.Forsendelse;
import no.fk.model.adresse.Avsender;
import no.fk.model.adresse.Mottaker;
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
        Avsender avsender = new Avsender();
        avsender.setNavn("Kari Olsen");

        Mottaker mottaker = new Mottaker();
        mottaker.setFnr("12345678901");

        Filmetadata filmetadata = new Filmetadata();
        filmetadata.setFilnavn("test.txt");

        Forsendelse forsendelse1 = new Forsendelse();
        forsendelse1.setAvsender(avsender);
        forsendelse1.setMottaker(mottaker);
        forsendelse1.addFilmetadata(filmetadata);
        forsendelse1.setId("123");

        Forsendelse forsendelse2 = new Forsendelse();
        forsendelse2.setAvsender(avsender);
        forsendelse2.setMottaker(mottaker);
        forsendelse2.addFilmetadata(filmetadata);
        forsendelse2.setId("234");

        String content = new ObjectMapper().writeValueAsString(Lists.newArrayList(forsendelse1, forsendelse2));
        whenMessageProcessor("request").ofNamespace("http").thenReturn(muleMessageWithPayload("test".getBytes()));

        MuleEvent muleEvent = runFlow(Flows.SVARINN, testEvent(content.getBytes()));

        verifyCallOfMessageProcessor("request").ofNamespace("http").times(4);
        assertEquals(2, muleEvent.getMessage().getPayload(Forsendelse[].class).length);
    }


}
