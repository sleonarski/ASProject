import jsonreader.JSONReader;
import maxteperature.MaxTemperature;
import maxteperature.MaxTemperatureRegister;
import maxteperature.MaxTemperatureRepository;
import thermometermessage.MessagesRepository;
import thermometermessage.ThermometerMessage;

import java.util.List;

public  class ApplicationLogic {

    private static final JSONReader reader = new JSONReader();

    private static final MessagesRepository messagesRepository = new MessagesRepository();

    private static final MaxTemperatureRepository maxTemperatureRepository = new MaxTemperatureRepository();

    private static final MaxTemperatureRegister maxTemperatureRegister = new MaxTemperatureRegister();


    public static void read(String filename){

        List<String> JSONlist = reader.getJSONsFromFile(filename);

        List<ThermometerMessage> messagesList = messagesRepository.getMessagesList(JSONlist);

        List<MaxTemperature> maxTemperatureList = maxTemperatureRepository.getMaxTemperatureList(messagesList);

        maxTemperatureRegister.getTemperature(messagesList,maxTemperatureList);

    }
}
