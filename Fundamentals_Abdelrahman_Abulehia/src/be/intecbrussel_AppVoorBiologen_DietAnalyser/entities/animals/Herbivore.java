package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals;

import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Plant;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Herbivore extends Animal{

   Set<Plant> plantDiet = new LinkedHashSet<>();

    public Herbivore(String name) {this(name,0,0,0);}

    public Herbivore(String name, double weight, double height,double length)
    {super(name,weight,height,length);}

    public Set<Plant> getPlantDiet() {return plantDiet;}

    public void setPlantDiet(Set<Plant> plantDiet) {plantDiet = plantDiet;}

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);}

    public void printDiet(){plantDiet.forEach(System.out::println);}


    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                "} " + super.toString();
    }
}
