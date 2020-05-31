package com.xilva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] myArr = {1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        int i = userInput.nextInt();
        int result = 0;
            try{
                result = findIndex(myArr,i);
            } catch (Exception e){
                System.err.println("Wrong Indexes");
            }
        System.out.printf("index %d In myArr is : %d",i,result);
    }

    private static int findIndex(int[] dataArr, int index) throws Exception{
        return dataArr[index];
    }

}
