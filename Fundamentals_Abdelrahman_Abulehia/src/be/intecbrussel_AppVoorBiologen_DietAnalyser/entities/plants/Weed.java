package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants;

public class Weed extends Plant{
    private double area = 0;

    public Weed (String name ,double height,Colour colour,String sheet,String oder)
    {super(name,height, colour,sheet,oder);}

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                "} " + super.toString();
    }
}
