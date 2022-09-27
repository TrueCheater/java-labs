package com.example;

import com.google.gson.Gson;
import java.util.Objects;

public class Task2_1 {
    public static void main(String[] args) {
        Person person1 = new Person("Kate", "Khomra", "2003-01-09");

        Gson gson = new Gson();
        String json = gson.toJson(person1);

        Person person2 = gson.fromJson(json, Person.class);

        System.out.println(person1.equals(person2));

    }
}
