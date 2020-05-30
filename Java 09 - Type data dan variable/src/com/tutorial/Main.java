package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Type data
        // integer, byte, short, double, boolean, float, char
        int a = 10;
        System.out.println("======INTEGER======");
        System.out.println("Integer a = " + a);
        System.out.println("Nilai Max = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min = " + Integer.MIN_VALUE);
        System.out.println("Besaran Integer " + Integer.BYTES + " bytes");
        System.out.println("Besaran Integer " + Integer.SIZE + " bit");


        // byte, short, double, boolean, float, char
        byte b = 10;
        System.out.println("======BYTE======");
        System.out.println("Byte b = " + b);
        System.out.println("Nilai Max = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min = " + Byte.MIN_VALUE);
        System.out.println("Besaran Byte " + Byte.BYTES + " bytes");
        System.out.println("Besaran Byte " + Byte.SIZE + " bit");

        // short, double, boolean, float, char
        short c = 10;
        System.out.println("======SHORT======");
        System.out.println("Short c = " + c);
        System.out.println("Nilai Max = " + Short.MAX_VALUE);
        System.out.println("Nilai Min = " + Short.MIN_VALUE);
        System.out.println("Besaran Short " + Short.BYTES + " bytes");
        System.out.println("Besaran Short " + Short.SIZE + " bit");

        // double, boolean, float, char
        double d = 10D;
        System.out.println("======DOUBLE======");
        System.out.println("Double d = " + d);
        System.out.println("Nilai Max = " + Double.MAX_VALUE);
        System.out.println("Nilai Min = " + Double.MIN_VALUE);
        System.out.println("Besaran Double " + Double.BYTES + " bytes");
        System.out.println("Besaran Double " + Double.SIZE + " bit");

        // long
        long e = 10L;
        System.out.println("======LONG======");
        System.out.println("Long e = " + e);
        System.out.println("Nilai Max = " + Long.MAX_VALUE);
        System.out.println("Nilai Min = " + Long.MIN_VALUE);
        System.out.println("Besaran Long " + Long.BYTES + " bytes");
        System.out.println("Besaran Long " + Long.SIZE + " bit");

        // float
        float f = 10F;
        System.out.println("======FLOAT======");
        System.out.println("float f = " + e);
        System.out.println("Nilai Max = " + Float.MAX_VALUE);
        System.out.println("Nilai Min = " + Float.MIN_VALUE);
        System.out.println("Besaran float " + Float.BYTES + " bytes");
        System.out.println("Besaran float " + Float.SIZE + " bit");

        // char -> Berdasarkan ASCII
        char g = 'c';
        System.out.println("======CHAR======");
        System.out.println("Char g = " + g);
        System.out.println("Nilai Max = " + Character.MAX_VALUE);
        System.out.println("Nilai Min = " + Character.MIN_VALUE);
        System.out.println("Besaran Char " + Character.BYTES + " bytes");
        System.out.println("Besaran Char " + Character.SIZE + " bit");

        // boolean
        boolean h = true;
        System.out.println("======BOOLEAN======");
        System.out.println("Boolean h = " + h);

    }

}
