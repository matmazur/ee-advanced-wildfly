package beans;

import javax.enterprise.inject.Default;
import java.time.LocalDate;

//only one without qualificator is default anyway. annotation reduntant
@Default
public class SimpleMessageProducer implements MessageProducer {
    public String getMessage() {

        return "Simple message with date: " + LocalDate.now();
    }
}
