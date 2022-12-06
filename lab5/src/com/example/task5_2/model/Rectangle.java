package com.example.task5_2.model;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private double length;
    private double width;

    public Rectangle(String shapeColor, double length, double width) {
        super(shapeColor);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "▯\t-> " +
                "\tshapeColor=" + shapeColor +
                ", \tarea=" + calcArea();
    }
}
