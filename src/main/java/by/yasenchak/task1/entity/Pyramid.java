package by.yasenchak.task1.entity;

import java.io.Serializable;

public class Pyramid implements Serializable {

    private static final long serialVersionUID = -2890388334857103595L;
    private int numberOfAngles;
    private double height;
    private double bottomSideLength;
    private Point pointOfCentrePyramid;


    public Pyramid(){
        super();
    }

    public Pyramid(int numberOfAngles, double height, double radiusOfSphere, Point pointOfCentrePyramid){
        this.numberOfAngles = numberOfAngles;
        this.height = height;
        this.bottomSideLength = radiusOfSphere;
        this.pointOfCentrePyramid = pointOfCentrePyramid;
    }

    public int getNumberOfAngles() {
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

    public double getBottomSideLength() {
        return bottomSideLength;
    }

    public void setBottomSideLength(double bottomSideLength) {
        this.bottomSideLength = bottomSideLength;
    }

    public Point getPointOfCentrePyramid() {
        return pointOfCentrePyramid;
    }

    public void setPointOfCentrePyramid(Point pointOfCentrePyramid) {
        this.pointOfCentrePyramid = pointOfCentrePyramid;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        Pyramid pyramid = (Pyramid) o;

        return this.numberOfAngles == pyramid.numberOfAngles &&
                this.height == pyramid.height &&
                this.bottomSideLength == pyramid.bottomSideLength;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + Double.valueOf(numberOfAngles).hashCode();
        result = prime * result + Double.valueOf(height).hashCode();
        result = prime * result + Double.valueOf(bottomSideLength).hashCode();

        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "numberOfAngles=" + numberOfAngles +
                ", height=" + height +
                ", bottomSideLength=" + bottomSideLength +
                ", pointOfCentrePyramid=" + pointOfCentrePyramid +
                '}';
    }
}
