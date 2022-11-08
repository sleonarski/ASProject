import java.util.ArrayList;
import java.util.List;

public class MessagesRepository {

//    public List<MessagesRepository> messagesRepository = new ArrayList<>();

    List<String> JSONFiles = JSONReader.getJSONFromFile("./messages.txt");


    // fix parameter
    public List<ThermometerMessage> getRepositoryFromFile(List<String> JSONrepo) {

        List<ThermometerMessage> messagesRepo = new ArrayList<>();

        for (int i = 0; i < JSONFiles.toArray().length; i++) {
//            JSONtoMessage.messageWriter(JSONFiles.get(i));
            messagesRepo.add(JSONtoMessage.messageWriter(JSONFiles.get(i)));

        }
        return messagesRepo;
    }
}
