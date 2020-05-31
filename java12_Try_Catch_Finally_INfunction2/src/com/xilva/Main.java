package com.xilva;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] myArr = {1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        int i = userInput.nextInt();
        int iException = exceptionOfIndexes(myArr,i); // Exception in function
        System.out.println(iException+"\n");
        System.out.printf("Index %d berisi %d",i,iException);
    }



    private static int exceptionOfIndexes(int[] dataArr,int i){
        int hasil = 0;
            try{
                hasil = dataArr[i];
            } catch(Exception e){
                System.err.println("Wrong input for indexes");
            }
        return hasil;
    }

}
