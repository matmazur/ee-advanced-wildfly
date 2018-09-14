import beans.FileMessage;
import beans.MessageProducer;

import javax.inject.Inject;

public class MessagePrinter {

    @Inject @FileMessage
    private MessageProducer producer;


    public MessagePrinter() {
    }

    public void getMessage() {

        System.out.println(producer.getMessage());

    }
}
