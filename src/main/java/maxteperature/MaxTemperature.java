package maxteperature;

import thermometermessage.Thermometer;

public class MaxTemperature {

    private Thermometer thermometer;
    private double outsideValue = 0;
    private double insideValue = 0;
    private double matterValue = 0;

    public MaxTemperature(){}


    public Thermometer getThermometer() {return thermometer;}

    public void setThermometer(Thermometer thermometer){
        this.thermometer = thermometer;
    }


    public double getOutsideValue() {
        return outsideValue;
    }

    public void setOutsideValue(double outsideValue) {
        this.outsideValue = outsideValue;
    }

    public double getInsideValue() {
        return insideValue;
    }

    public void setInsideValue(double insideValue) {
        this.insideValue = insideValue;
    }

    public double getMatterValue() {
        return matterValue;
    }

    public void setMatterValue(double matterValue) {
        this.matterValue = matterValue;
    }

    @Override
    public String toString() {
        return "Max temperature: INSIDE: " + insideValue + ", OUTSIDE: " + outsideValue + ", MATTER: " + matterValue;
    }
}
