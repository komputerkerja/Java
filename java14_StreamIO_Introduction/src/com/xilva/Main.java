package com.xilva;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        // Membuka File
        FileInputStream myFile = new FileInputStream("input.txt");
        // Membaca File
        int data = myFile.read();
            while ( data != -1 ){
                System.out.print((char)data);
                data = myFile.read();
            }
        // Menutup File
            myFile.close();
    }
}
