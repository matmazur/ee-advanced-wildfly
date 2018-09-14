package beans;

import javax.enterprise.inject.Default;
import java.time.LocalDate;

@Message
public class SimpleMessageProducer implements MessageProducer {
    public String getMessage() {

        return "Simple message with date: " + LocalDate.now();
    }
}
