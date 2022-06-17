package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants;

public class Bush extends Plant{


    private LeafType leafType;
    private String fruit;


    public Bush (String name ,double height,Colour colour,String sheet,String oder)
    {super(name,height, colour,sheet,oder);}

    public LeafType getLeafType() {return leafType;}
    public void setLeafType(LeafType leafType) {this.leafType = leafType;}

    public String getFruit() {return fruit;}
    public void setFruit(String fruit) {this.fruit = fruit;}

    @Override
    public String toString() {
        return "Bush{" +
                "leafType=" + leafType +
                ", fruit='" + fruit + '\'' +
                "} " + super.toString();
    }
}
