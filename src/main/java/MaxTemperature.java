public class MaxTemperature {

    private String thermometerName;
    private double inside = 0.00;
    private double outside = 0.00;
    private double matter = 0.00;

    public MaxTemperature(){}

    public MaxTemperature(ThermometerMessage thermometerMessage){
        this.thermometerName = thermometerMessage.getName();
    }

    public MaxTemperature(ThermometerMessage thermometerMessage, double inside, double outside, double matter) {
//        this.thermometerMessage = thermometerMessage;
        this.thermometerName = thermometerMessage.getName();
        this.inside = inside;
        this.outside = outside;
        this.matter = matter;
    }

    public String getThermometerName() {
        return thermometerName;
    }

    public void setThermometerName(ThermometerMessage thermometerMessage) {
        this.thermometerName = thermometerMessage.getName();
    }


    public double getInside() {
        return inside;
    }

    public void setInside(double inside) {
        this.inside = inside;
    }

    public double getOutside() {
        return outside;
    }

    public void setOutside(double outside) {
        this.outside = outside;
    }

    public double getMatter() {
        return matter;
    }

    public void setMatter(double matter) {
        this.matter = matter;
    }

    @Override
    public String toString() {
        return "Max temperature " + thermometerName + "  : INSIDE: " + inside + ", OUTSIDE: " + outside + ", MATTER: " + matter;
    }
}
