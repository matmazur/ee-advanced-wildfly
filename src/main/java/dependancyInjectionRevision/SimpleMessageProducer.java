package dependancyInjectionRevision;

import java.time.LocalDate;
import java.time.LocalTime;

public class SimpleMessageProducer implements MessageProducer {
    public String getMessage() {

        return "Simple message with time: " + LocalTime.now();
    }
}
