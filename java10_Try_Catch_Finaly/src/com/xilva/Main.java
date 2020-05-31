package com.xilva;
// ArrayIndexOutOfBoundsException - Exception - IOException
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        System.out.println("Starting Application");
            int[] myArr = {1,2,3,4,5};
            Scanner inputUser = new Scanner(System.in);
            System.out.println("Masukan index yang anda cari di dalam array");
            int index = inputUser.nextInt();

            FileInputStream myFile  = null;
            try{
                myFile = new FileInputStream("test.txt");
                System.out.printf("index %d adalah %d",index,myArr[index]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Wrong index of input");
            }catch (IOException e){
                System.err.println("File not found : " + e);
            }


        System.out.println("\nEnd Of Application");
    }

}
