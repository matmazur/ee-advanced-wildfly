package beans;

import qualifiers.Message;

import java.time.LocalDate;

@Message
public class SimpleMessageProducer implements MessageProducer {
    public String getMessage() {

        return "Simple message with date: " + LocalDate.now();
    }
}
