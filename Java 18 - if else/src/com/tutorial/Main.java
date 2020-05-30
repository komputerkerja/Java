package com.tutorial;

import java.util.*;

public class Main {


    public static void main(String[] args){

        // membuat scaner untuk menanggkap input use

        Scanner userInput = new Scanner(System.in);

        int nilaiBenar = 6;
        int nilaiBenar2 = 9;
        int nilaiUser = userInput.nextInt();
        int x;
        System.out.println("Nilai tebakakn anda adalah " + nilaiUser);

        for(x = 1; x <= 10 ; x++){
            System.out.println("Nilai ke " + x);
        }

        if( nilaiUser >= nilaiBenar && nilaiUser <= nilaiBenar2){
            System.out.println("Anda menebak dengan benar!");
        } else{
            System.out.println("Tebakan anda salah");
        }


        int[] angka =
                {1,2,3,4,5,6,7,8,9,10};
        for (int item : angka) {
            if(item == 5 ) {
                System.out.println("Count is: " + item);
                break;
            }
        }

        int[][] arrAngka = {{50,20,10},{20,10,20},{20,50,7}};
        for(int i = 0; i < arrAngka.length ; i++){
            for(int r = 0; r <arrAngka[i].length; r++){
                System.out.println("Ini array " + arrAngka[i][r]);
            }
        }


    }






}
