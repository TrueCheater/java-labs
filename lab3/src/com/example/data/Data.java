package com.example.data;

import com.example.model.Circle;
import com.example.model.Rectangle;
import com.example.model.Shape;
import com.example.model.Triangle;

public class Data {
    public static Shape[] getArray() {
        return new Shape[]{new Rectangle("white", 23, 15.5),
                new Rectangle("yellow", 5, 10),
                new Rectangle("black", 33.3, 26),
                new Rectangle("orange", 73, 45),
                new Triangle("grey", 5, 7.3),
                new Triangle("red", 10, 3),
                new Triangle("blue", 37.2, 14),
                new Triangle("green", 12, 15),
                new Circle("pink", 47),
                new Circle("violet", 23.48),
                new Circle("black", 2.9)};
    }
}
