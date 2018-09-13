import beans.MessageProducer;

import javax.inject.Inject;

public class MessagePrinter {


    private MessageProducer producer;

    public MessageProducer getProducer() {
        return producer;
    }

    @Inject
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public MessagePrinter() {
    }

    public void getMessage() {

        System.out.println(producer.getMessage());

    }
}
