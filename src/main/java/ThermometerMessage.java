public class ThermometerMessage {

    private String messageType;
    private String name;
    private String point;
    private double temperature;
    private double duration;

    public ThermometerMessage() {
    }

    public ThermometerMessage(String messageType, String name, String point, double temperature, double duration ) {
        this.messageType = messageType;
        this.name = name;
        this.point = point;
        this.temperature = temperature;
        this.duration = duration;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ThermometerMessage{" +
                "messageType='" + messageType + '\'' +
                ", name='" + name + '\'' +
                ", point='" + point + '\'' +
                ", temperature=" + temperature +
                ", duration=" + duration +
                '}';
    }
}
