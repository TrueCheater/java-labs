package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab7Test {
    @Test
    void shouldFindWordWithMinNumberOfUniqueChar() {
        assertEquals("Anne", Task7_2.wordWithMinNumberOfUniqueChar("apple coffee Anne"));
    }

    @Test
    void shouldReturnFirstWordIfAllWordsHaveMinNumberOfUniqueChar() {
        assertEquals("ABc", Task7_2.wordWithMinNumberOfUniqueChar("ABc abc AAaBcC"));
    }

    @Test
    void shouldReturnWordWithNumbers() {
        assertEquals("1234", Task7_2.wordWithMinNumberOfUniqueChar("+_)(*&^% .,!#!@ 1234 ^^&&**(("));
    }

    @Test
    void shouldReturnEmptyString() {
        assertEquals("", Task7_2.wordWithMinNumberOfUniqueChar(""));
    }
}