package com.ronal;

public class Main {
    public static void main(String[] args) {
        //================================================================================
        float variable1,variable2;
        double hasil;
        variable1 = 211;variable2=5;hasil = variable1 / variable2;
        System.out.println("Hasil dari " + variable1 + " / " + variable2 + " = " + hasil);
        System.out.printf("Hasil dari %f / %f = %f\n",variable1,variable2,hasil);
//        Hasil dari 211.0 / 5.0 = 42.20000076293945
//        Hasil dari 211,000000 / 5,000000 = 42,200001
        //================================================================================
        int x = 9;
        int y = 6;
        float z = (float) x / y;
        System.out.printf("Hasil dari %d / %d = %f",x,y,z);
//        Hasil dari 9 / 6 = 1,500000
        //================================================================================
        for(x=0;x<3;x++){
            System.out.println(x);
        }
        //================================================================================
        boolean sameName = (x == y);
        if(!sameName){
            System.out.printf("Nilai %d dan %d bernilai %s",x,y, sameName);
        }
        //================================================================================
        
    }
}


