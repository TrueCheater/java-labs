package com.example.task5_4;

import java.io.IOException;

public class Task5_4 {
    public static void main(String[] args) throws IOException {
        TagUtils tagUtils = new TagUtils();
        tagUtils.printTagsFrequency(tagUtils.countAllTags());
    }
}
