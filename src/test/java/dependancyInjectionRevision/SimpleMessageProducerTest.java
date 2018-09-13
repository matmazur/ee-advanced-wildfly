package dependancyInjectionRevision;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class SimpleMessageProducerTest {

    @Test
    public void getMessage() {
        MessageProducer producer = new SimpleMessageProducer();

        String result = producer.getMessage();

        assertEquals("Simple message with date: " + LocalDate.now(), result);
    }
}