import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TemperatureRegister {
    private MessagesRepository messagesRepository;
//    private final List<ThermometerMessage> repositoryFromFile = messagesRepository.getRepositoryFromFile("./messages.txt");

    public TemperatureRegister (MessagesRepository messagesRepository){
        this.messagesRepository = new MessagesRepository();
    }

    public Set<MaxTemperature> initializeMaxTemperatureSet () {
        Set<MaxTemperature> maxTemperatures = new HashSet<>();
        List<ThermometerMessage> repositoryFromFile = messagesRepository.getRepositoryFromFile("./messages.txt");
        for (int i = 0; i < repositoryFromFile.size(); i++) {
            MaxTemperature maxTemperature = new MaxTemperature(repositoryFromFile.get(i));
            System.out.println(maxTemperature);
            maxTemperatures.add(maxTemperature);
        }
        return maxTemperatures;
    }


//    public Set<MaxTemperature> getTemperature(List<ThermometerMessage> thermometerMessages) {
//        Set<MaxTemperature> MAXTemperatures = new HashSet<>();
//        List<ThermometerMessage> repositoryFromFile = messagesRepository.getRepositoryFromFile();
//

//        for (int i = 0; i < repositoryFromFile.toArray().length; i++) {
//            repositoryFromFile.get(i).getPoint().equals(Point.INSIDE){
//
//            }
//
//        }
//
//        return MAXTemperatures;
//    }


}
