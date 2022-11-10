package thermometermessage;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

public class MessagesRepository {


    public List<ThermometerMessage> getMessagesList(List<String> JSONList) {

        List<ThermometerMessage> messageList = new ArrayList<>();

        for (String file : JSONList) {
            Value value = new Value();
            Thermometer thermometer = new Thermometer();
            ThermometerMessage tm = new ThermometerMessage(thermometer,value);
            try {

                JSONParser parser = new JSONParser();
                Object object = parser.parse(file);
                JSONObject mainJsonObject = (JSONObject) object;

                String type = (String) mainJsonObject.get("type");
//            System.out.println("type : " + type);
                tm.setType(type);

                JSONObject jsonObjectThermometer = (JSONObject) mainJsonObject.get("thermometer");
//            System.out.println("thermometer : ");


                String name = (String) jsonObjectThermometer.get("name");
//            System.out.println("        name : " + name);
                thermometer.setName(name);

                String point = (String) jsonObjectThermometer.get("point");
//            System.out.println("        point: " + point);
               thermometer.setPoint(Point.valueOf(point));

                JSONObject jsonObjectValue = (JSONObject) mainJsonObject.get("value");
//            System.out.println("value: ");


                double temperature = (double) jsonObjectValue.get("temperature");
//            System.out.println("        temperature: " + temperature);
                value.setTemperature(temperature);

                double duration = (double) jsonObjectValue.get("duration");
//            System.out.println("        duration: " + duration);
                value.setDuration(duration);

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            messageList.add(tm);
        }
        return messageList;
    }


}
