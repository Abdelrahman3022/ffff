package be.intecbrussel_AppVoorBiologen_DietAnalyser.entities.plants;

public class Plant {
    private String name;
    private double height;
    private Colour colour;
    private String sheet;
    private String oder;


    public Plant(String name, double height,Colour colour,String sheet,String oder) {
        this.name=name;
        this.height=height;
        this.colour=colour;
        this.sheet=sheet;
        this.oder=oder;

    }


    public double getHeight() {return height;}
    public String getName() {return name;}
    public Colour getColour() {return colour;}
    public String getOder() {return oder;}
    public String getSheet() {return sheet;}

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", colour=" + colour +
                ", sheet='" + sheet + '\'' +
                ", oder='" + oder + '\'' +
                '}';
    }
}
