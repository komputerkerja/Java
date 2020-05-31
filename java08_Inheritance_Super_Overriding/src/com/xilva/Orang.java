package com.xilva;
class MakhlukHidup {
    private String name,status;
    private float height,weight;
    //====================== Set Method ================================================
    void setStatus(String status){this.status = status;}
    void setName(String name){this.name = name;}
    void setHeight(float height){this.height = height;}
    void setWeight(float weight){ this.weight = weight;}
    void setAll(String name,String status,float height, float weight){
        this.setName(name);
        this.setStatus(status);
        this.setHeight(height);
        this.setWeight(weight);
    }
    //====================== Get Method ================================================
    String getName(){return  name;}
    String getStatus(){return status;}
    float getHeight(){return height;}
    float getWeight(){return weight;}
    String getAll(){
        String Desc="";
        Desc += "Name\t\t:\t" + this.getName() + "\n";
        Desc += "Status\t\t:\t" + this.getStatus() + "\n";
        Desc += "Weight\t\t:\t" + this.getWeight() + "\n";
        Desc += "Height\t\t:\t" + this.getHeight() + "\n";
        return Desc;
    }
}


public class Orang extends MakhlukHidup{
    public static void main(String[] args){
        Orang ronal = new Orang();
        Orang kwang = new Orang();
        Orang aldo = new Orang();
        ronal.setAll("Ronal Latupeirissa","Adult",168,66);
        kwang.setAll("Petrus Lim","Adult",170,67);
        aldo.setAll("Revaldo Junior","Young",126,25);

        System.out.println(ronal.getAll());
        System.out.println(kwang.getAll());
        System.out.println(aldo.getAll());
    }
}
