package be.intecbrussel_AppVoorBiologen_DietAnalyser.digitale_boek;

import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Animal;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Carnivore;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Herbivore;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals.Omnivore;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Plant;
import be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants.Colour;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class ForestNotebook {
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();
    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private List<Colour> colours = new LinkedList<>();
    private int plantCount = 0;
    private int animalCount = 0;
    public List<Carnivore> getCarnivores() {
        carnivores = new ArrayList<>();
        if (animals==null){
            System.out.println("List is null");
        }if(animals.isEmpty()){
            System.out.println("List is Empty");
        }
        for ( Animal ani : animals){
            if (ani.getClass().equals(Carnivore.class)){
                carnivores.add((Carnivore) ani);
            }
        }
        return carnivores;}

    public List<Omnivore> getOmnivores() {
        omnivores = new ArrayList<>();
        for(Animal ani : animals){
            if (ani.getClass().equals(Omnivore.class)){
                omnivores.add((Omnivore) ani);
            }
        }
        return omnivores;}

    public List<Herbivore> getHerbivores() {
        herbivores = new ArrayList<>();
        for(Animal ani :animals){
            if (ani.getClass().equals(Herbivore.class)){
                herbivores.add((Herbivore) ani);
            }
        }
        return herbivores;}

    public int getPlantCount() {return plantCount;}

    public int getAnimalCount() {return animalCount;}
    public void addPlant(Plant plant){
        if (plants.contains(plant)){
            plants.add(plant);
            plantCount++;
        }else {
            System.out.println("The Name for plant's is:"+plant.getName());
            plants.add(plant);
        }
    }
    public void addAnimal(Animal animal){
        if (animals.contains(animal)){
            animals.add(animal);
            animalCount++;
        }else {
            System.out.println("The Name for Animal's is:"+animal.getName());
            animals.add(animal);
            animalCount++;
        }
    }




    /////////////

        public void printNotebook(){
        System.out.println("List of all animals:");
        animals.forEach(System.out::println);
        System.out.println("");
        System.out.println("List of all animals plants :");
        plants.forEach(System.out::println);
    }

    public void sortAnimalsByName () {
        animals = animals.stream().distinct().sorted((Comparator.comparing(Animal::getName))).collect(Collectors.toList());

    }

    public void sortPlantsByName () {
        plants = plants.stream().distinct().sorted((Comparator.comparing(Plant::getName))).collect(Collectors.toList());
    }
// باقي فرز حسب الاحرف الابجدية


    public void sortPlantsByColour () {
        plants = plants.stream().distinct().sorted((Comparator.comparing(Plant::getColour))).collect(Collectors.toList());
    }
    public void sortAnimalsByHeight () {
        animals = animals.stream().distinct().sorted((Comparator.comparing(Animal::getHeight))).collect(Collectors.toList());
    }




    public void sortPlantsByHeight () {
        plants = plants.stream().distinct().sorted((Comparator.comparing(Plant::getHeight))).collect(Collectors.toList());
    }


}
