package beans;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@FileMessage
public class FileMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {


        String result = "";
        try {
            Path path = new File(getClass().getResource("/message.txt").toURI()).toPath();
            List<String> lines = Files.readAllLines(path);
            if (lines != null && !lines.isEmpty()) {
                result = lines.stream().reduce("", (a, b) -> a +"\n"+ b);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

        return result;
    }
}