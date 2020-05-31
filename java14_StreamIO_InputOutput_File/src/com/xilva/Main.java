package com.xilva;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        // Habis buka file otomatis di close
        try (FileInputStream inputFile = new FileInputStream("data.txt"); FileOutputStream outputFile = new FileOutputStream("dataOutput.txt")) {
            int buffer = inputFile.read();
            while (buffer != -1) {
                outputFile.write(buffer);
                buffer = inputFile.read();
            }
        }
    }
}
