package com.example;

import com.example.controller.Controller;
import com.example.model.ShapeUtils;
import com.example.view.View;

public class Task3_1 {
    public static void main(String[] args) {
        View view = new View();
        ShapeUtils shapeUtils = new ShapeUtils();
        Controller controller = new Controller(view, shapeUtils);

        controller.run();
    }
}
