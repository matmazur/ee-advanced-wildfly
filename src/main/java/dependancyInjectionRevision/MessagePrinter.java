package dependancyInjectionRevision;

public class MessagePrinter {


    MessageProducer producer = new SimpleMessageProducer();

    public void getMessage(){

        System.out.println(producer.getMessage());

    }
}
