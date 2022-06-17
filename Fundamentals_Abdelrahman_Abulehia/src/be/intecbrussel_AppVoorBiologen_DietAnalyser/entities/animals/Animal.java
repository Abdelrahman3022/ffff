package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Plant;

import java.util.LinkedList;
import java.util.List;

public class Animal {
    private String name;
    private double weight,height,length;
    private int decibel;
    private String sound;

    public Animal(String name){
        this("",0,0,0,0,"");
    }

    public Animal(String name,double weight,double height,
                  double length,int decibel,String sound){

        this.decibel=decibel;
        this.sound=sound;

    }

    public Animal(String name, double weight, double height, double length) {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.length=length;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public double getLength() {return length;}
    public void setLength(double length) {this.length = length;}

    public int getDecibel() {return decibel;}
    public void setDecibel(int decibel) {this.decibel = decibel;}

    public String getSound() {return sound;}
    public void setSound(String sound) {this.sound = sound;}
//
   public void makeNoise(String sound){this.decibel= decibel;

       System.out.println("The type of sound is: "+getSound());
    }





    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", decibel=" + decibel +
                ", sound='" + sound + '\'' +
                '}';
    }
}
