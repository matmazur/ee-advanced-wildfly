package beans;

import qualifiers.FileName;
import qualifiers.Message;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Message(type = MessageType.FILE)
public class FileMessageProducer implements MessageProducer {

    @Inject @FileName
    private String fileName;

    @Override
    public String getMessage() {


        String result = "";
        try {
            Path path = new File(getClass().getResource(fileName).toURI()).toPath();
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