package com.example.task5_3;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class EncodingFilteredWriter extends FilterWriter {

    protected EncodingFilteredWriter(Writer out) {
        super(out);
    }

    public void write(String str) throws IOException {
        int key = 10;
        int[] codes = new int[str.length()];

        for (int i = 0; i < codes.length; i++) {
            codes[i] = str.charAt(i) + key;
            super.write(codes[i]);
        }
    }
}
