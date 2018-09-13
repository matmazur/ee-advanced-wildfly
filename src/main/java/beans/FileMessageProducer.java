//package beans;
//////
//////import java.io.IOException;
//////import java.nio.file.Files;
//////import java.nio.file.Paths;
//////import java.util.List;
//////
//////public class FileMessageProducer implements MessageProducer {
//////
//////    @Override
//////    public String getMessage() {
//////
//////
//////        String result = "";
//////        try {
//////            List<String> lines = Files.readAllLines(Paths.get("message.txt"));
//////            if (lines != null && !lines.isEmpty()) {
//////                result = lines.stream().reduce("", (a, b) -> a +"\n"+ b);
//////            }
//////        } catch (IOException e) {
//////            e.printStackTrace();
//////        }
//////
//////        return result;
//////    }
//////}