package com.tutorial;

import java.util.Scanner;

public class Main {

    public  static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int panjang, luas, lebar,tinggi, volume;
//        int input = userInput.nextInt();
//        System.out.println("Input = " + input);
//
//        int input2 = userInput.nextInt();
//        System.out.println("Input2 = " + input2);
//
//        int hasil = input * input2;
//        System.out.println(hasil);
        System.out.println("Menghitung Luas");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.print("Luas = " + luas);

        System.out.println("===========");
        System.out.println("Menghitung Volume");

        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.print("Volume = " + volume);

    }

}
