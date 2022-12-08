package com.example;

public class WordsData {
    public static Vocabulary getVocabulary() {
        Vocabulary vocabulary = new Vocabulary();
        vocabulary.addWord("coffee", "кава");
        vocabulary.addWord("water", "вода");
        vocabulary.addWord("tea", "чай");
        vocabulary.addWord("juice", "сік");
        vocabulary.addWord("milk", "молоко");
        vocabulary.addWord("cheese", "сир");
        vocabulary.addWord("cake", "торт");
        vocabulary.addWord("pie", "пиріг");
        vocabulary.addWord("apple", "яблуко");
        vocabulary.addWord("orange", "апельсин");
        vocabulary.addWord("potato", "картопля");
        vocabulary.addWord("carrot", "морква");

        return vocabulary;
    }
}
