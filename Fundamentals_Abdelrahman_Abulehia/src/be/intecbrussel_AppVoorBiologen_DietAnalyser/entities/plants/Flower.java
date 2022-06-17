package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants;

public class Flower extends Plant {
    private Scent smell;



    public Flower (String name ,double height,Colour colour,String sheet,String oder)
    {super(name,height, colour,sheet,oder);}


    public Scent getSmell() {return smell;}

    public void setSmell(Scent smell) {this.smell = smell;}

    @Override
    public String toString() {
        return "Flower{} " + super.toString();
    }
}
