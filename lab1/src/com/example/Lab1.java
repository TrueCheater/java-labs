package com.example;

import java.util.Arrays;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minUniqueCharWord(" u hello my dear friend 6788r  4urc 4-==-  ")));
        System.out.println(Arrays.toString(minUniqueCharWord("привіт. терен що ананас тин ")));
        System.out.println(Arrays.toString(minUniqueCharWord("leo bee sos  +%453! .,,'  ")));
        System.out.println(Arrays.toString(minUniqueCharWord("  fff   ggg   hhh ")));
        System.out.println(Arrays.toString(minUniqueCharWord(" AaA bBb  ")));
    }

    public static String[] minUniqueCharWord(String s) {
        String[] wordsArr = s.trim().split("\\s+");

        int minAmount = Integer.MAX_VALUE;
        String minWord = null;

        for (String word : wordsArr) {
            int[] counters = new int[2000];
            for (int i = 0; i < word.length(); i++) {
                counters[word.charAt(i)]++;
            }

            int uniqueChar = 0;
            for (int counter : counters) {
                if (counter != 0) {
                    uniqueChar++;
                }
            }

            if (uniqueChar < minAmount) {
                minAmount = uniqueChar;
                minWord = word;
            }
        }
        return new String[]{minWord, String.valueOf(minAmount)};
    }
}
