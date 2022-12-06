package com.example.task5_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {
    public static String getFilePath() {
        System.out.print("Enter file path: "); // src/com/example/task5_1/51.txt
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String maxWordNumberString(String filePath) throws IOException {
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)
        ) {
            String str;
            List<String> strList = new ArrayList<>();
            int maxNumber = 0;
            String maxNumberStr = "";

            while ((str = br.readLine()) != null) {
                strList.add(str);
            }

            for (String s : strList) {
                String[] words = s.trim().split("\\s+");
                if (words.length > maxNumber) {
                    maxNumber = words.length;
                    maxNumberStr = s;
                }
            }

            return maxNumberStr;
        }
    }

}

