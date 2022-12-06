package com.example.task5_3;

import java.io.*;
import java.util.Scanner;

public class Encryption {

    public void toEncode() throws IOException {
        System.out.print("Enter file to encode: "); // src/com/example/task5_3/53_message.txt
        Scanner scMessage = new Scanner(System.in);
        File fileMassage = new File(scMessage.nextLine());

        System.out.print("Enter file to save encoded message: "); // src/com/example/task5_3/53_encoded.txt
        Scanner scEncoded = new Scanner(System.in);
        File fileEncoded = new File(scEncoded.nextLine());

        try (FileReader fr = new FileReader(fileMassage);
             BufferedReader br = new BufferedReader(fr);
             EncodingFilteredWriter efr = new EncodingFilteredWriter(new FileWriter(fileEncoded))
        ) {
            String strMessage = br.readLine();
            efr.write(strMessage);
        }
    }

    public void toDecode() throws IOException {
        System.out.print("\nEnter file to decode: "); // src/com/example/task5_3/53_encoded.txt
        Scanner scEncoded = new Scanner(System.in);
        File fileEncoded = new File(scEncoded.nextLine());

        System.out.print("Enter file to save decoded message: "); // src/com/example/task5_3/53_decoded.txt
        Scanner scDecoded = new Scanner(System.in);
        File fileDecoded = new File(scDecoded.nextLine());

        try (DecodingFilteredReader dfr = new DecodingFilteredReader(new FileReader(fileEncoded));
             FileWriter fw = new FileWriter(fileDecoded);
             BufferedWriter bw = new BufferedWriter(fw)
        ) {
            while (dfr.ready()) {
                bw.write(dfr.read());
            }
        }
    }

    public void runEncryption() throws IOException {
        toEncode();
        System.out.println("Encoded");

        System.out.print("\nWant to decode? (y/n) : ");
        Scanner ansScanner = new Scanner(System.in);
        String ans = ansScanner.nextLine();

        if (ans.equals("y")) {
            toDecode();
            System.out.println("Decoded");
        } else if (ans.equals("n")) {
            System.out.println(":(");
        }
    }

}
