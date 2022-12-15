package com.example;

import java.util.Arrays;
import java.util.Comparator;

public class Task7_2 {
    public static String wordWithMinNumberOfUniqueChar(String s) {
        return Arrays.stream(s.trim().split("\\s+"))
                .min(Comparator.comparingLong(w -> w.chars().distinct().count()))
                .get();
    }
}