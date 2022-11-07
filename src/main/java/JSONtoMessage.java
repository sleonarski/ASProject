import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JSONtoMessage {

//    List<String> JSONFiles = JSONReader.getJSONFromFile("./messages.txt");


    public static ThermometerMessage messageWriter(String JSONfile) {

        ThermometerMessage tm = new ThermometerMessage();

        try {

            JSONParser parser = new JSONParser();
            Object object = parser.parse(JSONfile);
            JSONObject mainJsonObject = (JSONObject) object;

            String type = (String) mainJsonObject.get("type");
            System.out.println("type : " + type);
            tm.setMessageType(type);

            JSONObject jsonObjectThermometer = (JSONObject) mainJsonObject.get("thermometer");
            System.out.println("thermometer : ");


            String name = (String) jsonObjectThermometer.get("name");
            System.out.println("        name : " + name);
            tm.setName(name);

            String point = (String) jsonObjectThermometer.get("point");
            System.out.println("        point: " + point);
            tm.setPoint(point);

            JSONObject jsonObjectValue = (JSONObject) mainJsonObject.get("value");
            System.out.println("value: ");


            double temperature = (double) jsonObjectValue.get("temperature");
            System.out.println("        temperature: " + temperature);
            tm.setTemperature(temperature);

            double duration = (double) jsonObjectValue.get("duration");
            System.out.println("        duration: " + duration);
            tm.setDuration(duration);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tm;
    }
}
