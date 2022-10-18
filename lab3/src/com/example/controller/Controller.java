package com.example.controller;

import com.example.data.Data;
import com.example.model.*;
import com.example.view.View;

public class Controller {
    private View view;
    private ShapeUtils shapeUtils;

    public Controller(View view, ShapeUtils shapeUtils) {
        this.view = view;
        this.shapeUtils = shapeUtils;
    }

    public void run() {
        view.printMessage(View.ARRAY_OUTPUT);
        view.printArray(Data.getArray());
        view.printMessageWithResult(View.TOTAL_AREA, shapeUtils.totalArea(Data.getArray()));
        view.printMessage(View.TOTAL_AREA_BY_SHAPES);
        view.printMessageWithResult(View.RECTANGLE_CLASS_NAME, shapeUtils.totalAreaByShapes(Data.getArray(), "Rectangle"));
        view.printMessageWithResult(View.TRIANGLE_CLASS_NAME, shapeUtils.totalAreaByShapes(Data.getArray(), "Triangle"));
        view.printMessageWithResult(View.CIRCLE_CLASS_NAME, shapeUtils.totalAreaByShapes(Data.getArray(), "Circle"));
        view.printMessage(View.AREA_SORT);
        view.printArray(shapeUtils.sortByArea(Data.getArray()));
        view.printMessage(View.COLOR_SORT);
        view.printArray(shapeUtils.sortByColor(Data.getArray()));
    }
}
