import beans.FileMessageProducer;
import beans.SimpleMessageProducer;

public class Main {


    public static void main(String[] args) {


        MessagePrinter printer = new MessagePrinter();
        printer.setProducer(new SimpleMessageProducer());
        printer.getMessage();
        printer.setProducer(new FileMessageProducer());
        printer.getMessage();

    }
}
