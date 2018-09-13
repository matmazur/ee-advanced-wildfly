package dependancyInjectionRevision;

public class MessagePrinter {


    MessageProducer producer ;

    public MessagePrinter(MessageProducer producer){
        this.producer=producer;
    }

    public void getMessage(){

        System.out.println(producer.getMessage());

    }
}
