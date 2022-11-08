import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {



        List<String> JSONFiles = JSONReader.getJSONFromFile("./messages.txt");

//        String JSONfilee = JSONFiles.get(0);

//        JSONtoMessage.messageWriter(JSONfilee);

//        System.out.println(JSONtoMessage.messageWriter(JSONfilee));


        MessagesRepository mr = new MessagesRepository();


        List<ThermometerMessage> repositoryFromFile = mr.getRepositoryFromFile(JSONFiles);


        System.out.println(repositoryFromFile);

        System.out.println("THE TEMPERATURE IS : " + repositoryFromFile.get(1).getTemperature());
    }
}
