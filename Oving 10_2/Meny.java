import java.util.*;

public class Meny{
    private String menuName;
    private ArrayList<Rett> dishes;
    private double totalPrice;
    

    public Meny(String menuName, ArrayList<Rett> dishes) {
        this.menuName = menuName;
        this.dishes = dishes;
        for(Rett x : dishes) {
            this.totalPrice += x.getPrice();
        }
    }

    public double getPrice() {
        return this.totalPrice;
    }

    public String getName() {
        return this.menuName;
    }

    public ArrayList<Rett> getDishes() {
        return dishes;
    }

    public String toString() {
        String text = "";
        for(Rett y : dishes) {
            text += y.toString()+"\n";
        }
        return "\nMenynavn: " + this.getName() + text;
    }
}