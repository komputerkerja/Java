package com.xilva;

public class Orang {

    String name = "myName";
    int age = 0;


    public static void main(String[] args){
        Orang teo = new Orang();
        Orang ronal = new Orang();
        String myMoney;

            ronal.name = "Ronal latupeirissa";
            ronal.age  = 32;
            myMoney = howMuchHesMoney( ronal.name,ronal.age,250000);
            whoAreYou(ronal.name,ronal.age,myMoney);

            teo.name = "Theo dores";
            teo.age = 30;
            myMoney = howMuchHesMoney( teo.name,teo.age,621000);
            whoAreYou(teo.name,teo.age,myMoney);

    }

    private static void whoAreYou(String name, int age, String myMoney) {
        System.out.println(name + " berusia " + age + " Memiliki uang " + myMoney);
    }

    private static String howMuchHesMoney(String name, int age, int i) {
        return name + ":" + age + " Uang : " + i;
    }


}
