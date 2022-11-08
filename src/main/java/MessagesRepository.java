import java.util.ArrayList;
import java.util.List;

public class MessagesRepository {

    private JSONtoMessage JSONToMessage = new JSONtoMessage();
    private JSONReader jsonReader = new JSONReader();



//   List<String> JSONFiles = jsonReader.getMessageFromFile("./messages.txt");


    // fix parameter
    public List<ThermometerMessage> getRepositoryFromFile(String fileName) {
        List<String> JSONFiles = jsonReader.getMessageFromFile(fileName);

        List<ThermometerMessage> messagesRepo = new ArrayList<>();

        for (int i = 0; i < JSONFiles.toArray().length; i++) {
//            JSONtoMessage.messageWriter(JSONFiles.get(i));
            messagesRepo.add(JSONToMessage.messageWriter(JSONFiles.get(i)));

        }
        return messagesRepo;
    }
}
