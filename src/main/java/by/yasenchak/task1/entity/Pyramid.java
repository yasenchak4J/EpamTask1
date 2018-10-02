package by.yasenchak.task1.entity;

import java.io.Serializable;

public class Pyramid implements Serializable {

    private double numberOfAngles;
    private double height;
    private double radiusOfSphere;


    public Pyramid(){
        super();
    }

    public double getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadiusOfSphere() {
        return radiusOfSphere;
    }

    public void setRadiusOfSphere(double radiusOfSphere) {
        this.radiusOfSphere = radiusOfSphere;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        Pyramid pyramid = (Pyramid) o;

        return this.numberOfAngles == pyramid.numberOfAngles &&
                this.height == pyramid.height &&
                this.radiusOfSphere == pyramid.radiusOfSphere;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + Double.valueOf(numberOfAngles).hashCode();
        result = prime * result + Double.valueOf(height).hashCode();
        result = prime * result + Double.valueOf(radiusOfSphere).hashCode();

        return result;
    }
}
