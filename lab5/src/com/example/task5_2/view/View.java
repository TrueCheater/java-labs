package com.example.task5_2.view;

import com.example.task5_2.model.Shape;

public class View {

    public static final String ARRAY_OUTPUT = "Array of shapes:";
    public static final String TOTAL_AREA = "\nTotal area of all shapes = ";
    public static final String TOTAL_AREA_BY_SHAPES = "\nTotal area of all shape types: ";
    public static final String RECTANGLE_CLASS_NAME = "\tRectangle = ";
    public static final String TRIANGLE_CLASS_NAME = "\tTriangle = ";
    public static final String CIRCLE_CLASS_NAME = "\tCircle = ";
    public static final String AREA_SORT = "\nSorted by area in increasing order:";
    public static final String COLOR_SORT = "\nSorted by color:";

    public void printArray(Shape[] array) {
        for (Shape shape : array) {
            System.out.println("\t" + shape);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageWithResult(String message, double result) {
        System.out.println(message + result);
    }

}
