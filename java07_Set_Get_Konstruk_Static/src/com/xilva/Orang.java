package com.xilva;
public class Orang {
    float height;int age;String name;
   // Main function ========================================================
   public static void main(String[] args){
        Orang ronal = new Orang("Ronal Latupeirissa",165,33);
        Orang kwang = new Orang("Petrus Lim",168,34);

       System.out.println(ronal.name + "\t : Tiggi " + ronal.height + "\t : Umur " + ronal.age);
       System.out.println(kwang.name + "\t : Tinggi " + kwang.height + "\t : Umur " + kwang.age);
       System.out.println("========================================");

       ronal.setNameOrang("Ronal saja");kwang.setNameOrang("Petrus saja");

       System.out.println(ronal.name + "\t : Tiggi " + ronal.height + "\t : Umur " + ronal.age);
       System.out.println(kwang.name + "\t : Tinggi " + kwang.height + "\t : Umur " + kwang.age);
   }
   // Constructor ==========================================================
   public Orang(String name,float height,int age){
       this.name = name; this.height = height; this.age = age;
   }
    // Set Method ==========================================================
    private void setNameOrang(String nameTxt){ name  = nameTxt; }
    private void setHeightOrang(float heightTxt){ height  = heightTxt; }
    // Get Method ==========================================================
    private String getNameOrang(){ return name; }
    private float getHeightOrang(){ return height; }
}
