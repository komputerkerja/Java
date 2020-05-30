package com.tutorial;

import java.util.*;
public class Main {
    public static void main(String[] args){

        String input;

        Scanner inputUser = new Scanner(System.in);
        input = inputUser.next();

        System.out.print("Nama = ");
        System.out.println(input);

        switch (input){
            case "Ronal":
                System.out.println("Anda ronal");
                break;
            case "Vera":
                System.out.println("Anda vera");
                break;
            case "Aldo":
                System.out.println("Anda aldo");
                break;
            default:
                System.out.println("Anda siapa?");
        }

        // ternary
        // var x = expresi ? steatment true : steament false;

        int x, nilai;

        System.out.print("Masukan Nilai : ");
        nilai = inputUser.nextInt();
        x = (nilai==10) ? nilai : nilai*0;
        System.out.println("Anda mendapat nilai = " + x);

        for(x=0;x<3;x++){
            System.out.println("Pengulangan for " + x);
        }

        int a = 0;
        while(a <= 5){
            System.out.println("Pengulanan while " + a);
            a++;
        }







    }





}
