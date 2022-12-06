package com.example.task5_2.model;

import java.util.Arrays;

public class ShapeUtils {
    public double totalArea(Shape[] array) {
        double sumArea = 0;
        for (Shape shape : array) {
            sumArea += shape.calcArea();
        }
        return sumArea;
    }

    public double totalAreaByShapes(Shape[] array, String className) {
        double totalArea = 0;
        for (Shape shape : array) {
            if (shape.getClass().getSimpleName().equals(className)) {
                totalArea += shape.calcArea();
            }
        }
        return totalArea;
    }

    public Shape[] sortByArea(Shape[] array) {
        Arrays.sort(array, new AreaComparator());
        return array;
    }

    public Shape[] sortByColor(Shape[] array) {
        Arrays.sort(array, new ColorComparator());
        return array;
    }
}
