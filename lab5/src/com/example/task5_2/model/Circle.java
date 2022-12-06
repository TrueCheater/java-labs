package com.example.task5_2.model;

import java.io.Serializable;

public class Circle extends Shape implements Serializable {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "○\t-> " +
                "\tshapeColor=" + shapeColor +
                ", \tarea=" + calcArea();
    }
}
