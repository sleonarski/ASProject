package maxteperature;

import thermometermessage.Point;
import thermometermessage.ThermometerMessage;

import java.util.List;

public class MaxTemperatureRegister {



    public void getTemperature(List<ThermometerMessage> messagesList, List<MaxTemperature> maxTemperatureList){
        for (ThermometerMessage message : messagesList) {
            System.out.println();
            System.out.println(message);
            for (MaxTemperature maxTemperature : maxTemperatureList) {
                Point thermometerPoint = message.getThermometer().getPoint();
                if (message.getThermometer().getName().equals(maxTemperature.getThermometer().getName())) {
                    if (thermometerPoint.equals(Point.INSIDE)) {
                        if (message.getValue().getTemperature() > maxTemperature.getInsideValue()) {
                            maxTemperature.setInsideValue(message.getValue().getTemperature());
                        }
                        System.out.println(maxTemperature);
                    } else if (thermometerPoint.equals(Point.MATTER)) {
                        if (message.getValue().getTemperature() > maxTemperature.getMatterValue()) {
                            maxTemperature.setMatterValue(message.getValue().getTemperature());
                        }
                        System.out.println(maxTemperature);
                    } else if (thermometerPoint.equals(Point.OUTSIDE)) {
                        if (message.getValue().getTemperature() > maxTemperature.getOutsideValue()) {
                            maxTemperature.setOutsideValue(message.getValue().getTemperature());
                        }
                        System.out.println(maxTemperature);
                        System.out.println();
                    }

                }

            }
        }
    }

}
