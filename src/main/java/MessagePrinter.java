import beans.Message;
import beans.MessageProducer;
import beans.MessageType;

import javax.inject.Inject;

public class MessagePrinter {

    @Inject @Message(type = MessageType.FILE)
    private MessageProducer producer;


    public MessagePrinter() {
    }

    public void getMessage() {

        System.out.println(producer.getMessage());

    }
}
