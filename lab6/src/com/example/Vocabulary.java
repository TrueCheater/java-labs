package com.example;

import java.util.HashMap;

public class Vocabulary {
    private final HashMap<String, String> vocabulary = new HashMap<>();

    public void addWord(String eng, String ua) {
        vocabulary.put(eng, ua);
    }

    public String translate(String eng) {
        return vocabulary.getOrDefault(eng, "No such word found!");
    }

    @Override
    public String toString() {
        return "Vocabulary" + vocabulary;
    }
}
