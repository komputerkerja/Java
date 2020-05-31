package com.xilva;

class MakhlukHidup{
    private String name,status;
    private float height,weight;

    void set(String name,String status,float height, float weight){
        this.name=name;this.status=status;this.height=height;this.weight=weight;
    }

    String get(){
        String Desc = "";
        Desc += "Name \t\t:\t" + this.name + "\n";
        Desc += "Status \t\t:\t" + this.status + "\n";
        Desc += "Height \t\t:\t" + this.height + "\n";
        Desc += "Weight \t\t:\t" + this.weight + "\n";
        return Desc;
    }
}

public class Orang extends MakhlukHidup{

    public static void main(String[] args){
        Orang ronal = new Orang();
        Orang kwang = new Orang();
        Orang aldo = new Orang();

        ronal.set("Ronal Latupeirissa","Adult",166,66);
        kwang.set("Petrus Lim","Adult",170,68);
        aldo.set("Revaldo Junior Latupeirissa","Young",125,26);

        System.out.println(ronal.get());
        System.out.println(kwang.get());
        System.out.println(aldo.get());
    }
}
