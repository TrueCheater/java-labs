package com.example.task5_2;

import com.example.task5_2.controller.Controller;
import com.example.task5_2.model.ShapeUtils;
import com.example.task5_2.view.View;

import java.io.IOException;

public class Task5_2 {
    public static void main(String[] args) throws IOException {
        View view = new View();
        ShapeUtils shapeUtils = new ShapeUtils();
        Controller controller = new Controller(view, shapeUtils);
        controller.run();
        DataSaver.saveDataInFile();
        DataSaver.readDataFromFile();
    }
}
