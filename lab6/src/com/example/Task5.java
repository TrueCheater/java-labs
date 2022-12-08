package com.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Vocabulary vocabulary = WordsData.getVocabulary();
        System.out.println(vocabulary);

        toAddWords(vocabulary);
        toTranslate(vocabulary);
    }

    public static void toAddWords(Vocabulary v) {
        System.out.print("\nAdd a new word? (y/n) : ");
        Scanner ansScanner = new Scanner(System.in);
        String ans = ansScanner.nextLine();

        while (ans.equals("y")) {
            System.out.print("Enter eng word: ");
            Scanner scEng = new Scanner(System.in);
            String eng = scEng.nextLine();

            System.out.print("Enter ua translation: ");
            Scanner scUa = new Scanner(System.in);
            String ua = scUa.nextLine();

            v.addWord(eng, ua);

            System.out.print("\nAdd a new word? (y/n) : ");
            ans = ansScanner.nextLine();
        }

        System.out.println("\n" + v);
    }

    public static void toTranslate(Vocabulary v) {
        System.out.print("\nTranslate to Ukrainian? (y/n) : ");
        Scanner ansScanner = new Scanner(System.in);
        String ans = ansScanner.nextLine();

        while (ans.equals("y")) {
            System.out.print("Enter eng word: ");
            Scanner scEng = new Scanner(System.in);
            String eng = scEng.nextLine();

            System.out.println(eng + " -> " + v.translate(eng));

            System.out.print("\nTranslate to Ukrainian? (y/n) : ");
            ans = ansScanner.nextLine();
        }
    }
}
