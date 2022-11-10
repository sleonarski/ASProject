package thermometermessage;

public class ThermometerMessage {

    private String type;
    private Thermometer thermometer;
    private Value value;

    public ThermometerMessage(Thermometer thermometer, Value value) {
        this.thermometer = thermometer;
        this.value = value;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Thermometer getThermometer() {
        return thermometer;
    }

    public void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "'type':'"  + type + '\'' +
                ", 'thermometer' : {'name':'" + thermometer.getName() + '\'' +
                ", 'point':'" + thermometer.getPoint() + '\'' +
                "}, 'value' : {'temperature':'" + value.getTemperature() +
                ", 'duration':'" + value.getDuration() +
                '}';
    }



}
