public class Rett{
    private String Name, Type, Recipe;
    private double Price;

    public Rett(String Type, String Name, double Price, String Recipe) {
        this.Type = Type;
        this.Name = Name;
        this.Price = Price;
        this.Recipe = Recipe;
    }

    public double getPrice(){
        return Price;
    }

    public String getType(){
        return Type;
    }

    public String getName(){
        return Name;
    }

    public String getRecipe(){
        return Recipe;
    }

    public String toString(){
        return ("\nNavn: " + getName() + "\nType: " + getType() + "\nPris: " + getPrice() + "\nOppskrift: " + getRecipe());
    }

}