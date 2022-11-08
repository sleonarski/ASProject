import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

JSONReader jsonReader = new JSONReader();

        List<String> JSONFiles = jsonReader.getMessageFromFile("./messages.txt");

//        String JSONfilee = JSONFiles.get(0);

//        JSONtoMessage.messageWriter(JSONfilee);

//        System.out.println(JSONtoMessage.messageWriter(JSONfilee));


        MessagesRepository mr = new MessagesRepository();


        List<ThermometerMessage> repositoryFromFile = mr.getRepositoryFromFile("./messages.txt");


//        System.out.println(repositoryFromFile);

        System.out.println(" ");

        System.out.println("THE TEMPERATURE IS : " + repositoryFromFile.get(1).getTemperature());

        System.out.println(" ");


        for (ThermometerMessage thermometerMessage : repositoryFromFile) {
            System.out.println(thermometerMessage);
        }
        System.out.println("Messages count: " + repositoryFromFile.size());

//        PointtReader pointt = new PointtReader(Pointt.INSIDE);

        System.out.println();

        MaxTemperature mt = new MaxTemperature();

        System.out.println(mt);

        mt.setMatter(40);

        mt.setOutside(20);

        System.out.println(mt);
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            System.out.println(repositoryFromFile.size());


        TemperatureRegister tr = new TemperatureRegister(mr);

        Set<MaxTemperature> maxTemperatures = tr.initializeMaxTemperatureSet();

//        System.out.println(maxTemperatures);


    }
}
