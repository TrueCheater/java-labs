package com.example.task5_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagUtils {
    private final List<String> tagsList = new ArrayList<>();

    public String getUrl() {
        System.out.print("Enter URL: ");    // https://www.york.ac.uk/teaching/cws/wws/webpage1.html
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void tagsFinder(String str) {
        Pattern pattern = Pattern.compile("<([^\\s>/]+)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String tag = matcher.group(1);
            tagsList.add(tag);
        }
    }

    public Map<String, Integer> countAllTags() throws IOException {
        URL url = new URL(getUrl());

        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            br.lines().forEach(this::tagsFinder);
        }

        Map<String, Integer> tagsFrequency = new HashMap<>();

        for (String tag : tagsList) {
            Integer frequency = tagsFrequency.get(tag);
            if (frequency != null) {
                frequency++;
            } else {
                frequency = 1;
            }
            tagsFrequency.put(tag, frequency);
        }

        return tagsFrequency;
    }

    public void printTagsFrequency(Map<String, Integer> map) {
        System.out.println("\nTags frequency: " + map);

        System.out.println("\nSorted by tag name in ascending order: ");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println("\nSorted by tag frequency in ascending order: ");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

}

