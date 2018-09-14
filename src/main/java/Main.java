import beans.FileMessageProducer;
import beans.SimpleMessageProducer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        MessagePrinter printer = new MessagePrinter();
        printer.setProducer(new SimpleMessageProducer());
        printer.getMessage();
        printer.setProducer(new FileMessageProducer());
        printer.getMessage();


        System.out.println();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list.stream().reduce(0, (x, y) -> x + y));
    }
}
