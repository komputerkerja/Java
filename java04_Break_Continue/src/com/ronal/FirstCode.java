package com.ronal;
public class FirstCode {
    public static void main(String[] args){
        for( int x = 0; x < 5 ; x++ ){
            if(x == 3){ break; }
            System.out.println("Print for nilai ke - " + x); }
        System.out.println("====================");
        //==================================================
        for(int x = 0; x < 5 ; x++ ){
            if(x == 3){ continue; }
            System.out.println("Print for nilai ke - " + x); }
        System.out.println("====================");
        //==================================================
    }
}
