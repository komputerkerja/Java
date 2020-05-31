package com.xilva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] arrayNumeric = {1,2,3,4,5};
        Scanner userInput = new Scanner(System.in);
        int indexOfArray = userInput.nextInt();

            try{
                System.out.printf("Index %d has %d",indexOfArray,arrayNumeric[indexOfArray]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Wrong input of indexes : ");
            }

    }

}
