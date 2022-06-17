package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.animals;

public class Carnivore extends Animal {
    private double maxFoodSize =0;

    public Carnivore (String name){this(name,0,0,0);}

    public Carnivore(String name, double weight, double height, double length) {
        super(name,weight,height,length);

    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                "} " + super.toString();
    }
}
