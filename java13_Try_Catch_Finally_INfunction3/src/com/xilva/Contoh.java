package com.xilva;

import java.io.FileInputStream;
import java.io.IOException;

public class Contoh {

    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream("data.txt");
        System.out.println((char) inputFile.read());
    }

}
