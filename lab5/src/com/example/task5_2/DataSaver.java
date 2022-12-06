package com.example.task5_2;

import com.example.task5_2.model.Shape;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

import static com.example.task5_2.data.Data.getArray;

public class DataSaver {
    public static void saveDataInFile() throws IOException {
        System.out.print("\nSave data in file? (y/n) : ");
        Scanner ansScanner = new Scanner(System.in);
        String ans = ansScanner.nextLine();

        if (ans.equals("y")) {
            System.out.print("Enter file path: "); // src/com/example/task5_2/52.txt
            Scanner filePathScanner = new Scanner(System.in);
            File file = new File(filePathScanner.nextLine());
            try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {

                for (Shape shape : getArray()) {
                    oos.writeObject(shape);
                }

                System.out.println("Saved");
            }

        } else if (ans.equals("n")) {
            System.out.println(":(");
        }
    }

    public static void readDataFromFile() throws IOException {
        System.out.print("\nRead file? (y/n) : ");
        Scanner ansScanner = new Scanner(System.in);
        String ans = ansScanner.nextLine();

        System.out.print("Enter file to read: "); // src/com/example/task5_2/52.txt
        Scanner filePathScanner = new Scanner(System.in);
        File file = new File(filePathScanner.nextLine());

        if (ans.equals("y")) {
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file.toPath()))) {
                ArrayList<Shape> shapes = new ArrayList<>();
                for (Shape shape : getArray()) {
                    shapes.add((Shape) ois.readObject());
                }

                System.out.println("Read");
                System.out.println("\nResult:");
                for (Shape shape : shapes) {
                    System.out.println(shape);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } else if (ans.equals("n")) {
            System.out.println(":(");
        }
    }
}
