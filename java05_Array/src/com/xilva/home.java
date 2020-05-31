package com.xilva;
public class home {

    public static void main(String[] args){
        int[] kotak = new int[3];kotak[0] =  100;kotak[1] = 200;kotak[2]= 300;
        for(int x = 0; x < kotak.length; x++ ){
            System.out.println("Array dari kotak ke-" + x + " adalah " + kotak[x]);
        }
        //=====================================================================
        int[] kotak2 = new int[]{100,200,300,400,500};
        for(int x = 0; x < kotak2.length; x++ ){
            System.out.println("Array dari kotak2 ke - " + x + " adalah "+kotak2[x]);
        }
        //=====================================================================
        String[][] kotak3 = new String[][]{
                {"1","Ronal","23"},
                {"2","Vera","32"},
                {"3","Revaldo","10"},
                {"4","Rahmat","6"}
        };
        // For Each
        for (String[] columnSaya : kotak3) {
            for (String rowSaya : columnSaya) {
                System.out.println("Table\t: \t" + rowSaya);
            }
            System.out.println("--------------------");
        }
        
    }
}
