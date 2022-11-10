package maxteperature;

import thermometermessage.Thermometer;
import thermometermessage.ThermometerMessage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxTemperatureRepository {


    public List<MaxTemperature> getMaxTemperatureList(List<ThermometerMessage> messagesList) {


        Set<String> thermometers = new HashSet<>();
        for (ThermometerMessage message : messagesList) {
            String s = message.getThermometer().getName();
            thermometers.add(s);
        }


        List<MaxTemperature> maxTemperatureList = new ArrayList<>();
        for (String thermometer : thermometers) {
            if (!maxTemperatureList.contains(thermometer)) {
                MaxTemperature temperature = new MaxTemperature();
                temperature.setThermometer(new Thermometer(thermometer));
                maxTemperatureList.add(temperature);
            }

        }
        return maxTemperatureList;
    }

}
