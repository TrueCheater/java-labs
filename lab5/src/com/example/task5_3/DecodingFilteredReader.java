package com.example.task5_3;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class DecodingFilteredReader extends FilterReader {

    protected DecodingFilteredReader(Reader in) {
        super(in);
    }

    public int read() throws IOException {
        int key = 10;

        return super.read() - key;
    }
}
