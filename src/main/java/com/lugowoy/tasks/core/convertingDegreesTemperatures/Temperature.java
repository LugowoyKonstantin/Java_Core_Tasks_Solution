package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/**
 * Created by Konstantin on 11-Jan-17.
 */
public class Temperature {

    private double degreesTemperatures;
    private TemperatureScale scale;

    public Temperature() {
    }

    public Temperature(double degreesTemperatures, TemperatureScale scale) {
        this.degreesTemperatures = degreesTemperatures;
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "degreesTemperatures=" + degreesTemperatures +
                ", scale=" + scale +
                '}';
    }

    public double getDegreesTemperatures() {
        return degreesTemperatures;
    }

    public void setDegreesTemperatures(double degreesTemperatures) {
        this.degreesTemperatures = degreesTemperatures;
    }

    public TemperatureScale getScale() {
        return scale;
    }

    public void setScale(TemperatureScale scale) {
        this.scale = scale;
    }
}
