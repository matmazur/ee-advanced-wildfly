package dependancyInjectionRevision;

import javax.inject.Inject;

public class MessagePrinter {


    @Inject
    private MessageProducer producer;

    public MessagePrinter() {
    }

    public void getMessage() {

        System.out.println(producer.getMessage());

    }
}
