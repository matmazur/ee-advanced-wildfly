package beans;

import java.time.LocalDate;

public class SimpleMessageProducer implements MessageProducer {
    public String getMessage() {

        return "Simple message with date: " + LocalDate.now();
    }
}
