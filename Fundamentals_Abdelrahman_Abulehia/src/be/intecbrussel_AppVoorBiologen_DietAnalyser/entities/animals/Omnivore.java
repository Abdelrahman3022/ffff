package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals;

import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Plant;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Omnivore extends Animal{
    Set<Plant> plantDiet;
    {plantDiet=new HashSet<>();}

    private double maxFoodSize =0;

    public Omnivore(String name) {
        this(name,0,0,0);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name,weight,height,length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
