package thermometermessage;

public class Thermometer {

    private String name;
    private Point point;

    public Thermometer(){}

    public Thermometer(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
