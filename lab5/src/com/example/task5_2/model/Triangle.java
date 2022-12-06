package com.example.task5_2.model;

import java.io.Serializable;

public class Triangle extends Shape implements Serializable {
    private double height;
    private double base;

    public Triangle(String shapeColor, double height, double base) {
        super(shapeColor);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "△\t-> " +
                "\tshapeColor=" + shapeColor
                + ", \tarea=" + calcArea();
    }
}
