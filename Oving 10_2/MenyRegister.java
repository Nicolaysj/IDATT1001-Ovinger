import java.util.*;

public class MenyRegister {
    private ArrayList<Meny> menyer;
    //private ArrayList<Rett> dishes;

    public MenyRegister(ArrayList<Meny> menyer) {
        this.menyer = menyer;
    }

    public Rett registrerRett(String Type, String Name, double Price, String Recipe) {
        for(int i = 0; i < menyer.size(); i++) {
            for(int j = 0; j < menyer.get(i).getDishes().size(); j++){
            String checkName = menyer.get(i).getDishes().get(j).getName();
            if(checkName.equals(Name)) {
                System.out.println("Denne retten er allered registrert.");
                return null;
            }
            }
        }
        Rett nyRett = new Rett(Type, Name, Price, Recipe);
        return nyRett;
    }

    /*public void registrerRett(Rett dishes){
        dishes.add(nyRett);
    }*/

    public Meny registrerMeny(String Name, ArrayList<Rett> dishes) {
        Iterator<Meny> mIterator = this.menyer.iterator();
        while(mIterator.hasNext()) {
            Meny m = mIterator.next();
            if(m.getName().equalsIgnoreCase(Name)) {
                System.out.println("Denne menyen er allered registrert.");
                return null;
            }
        }
        Meny newMeny = new Meny(Name, dishes);
        this.menyer.add(newMeny);
        return newMeny;
    }

    public Rett finnRett(String Name) {
        Iterator<Meny> menyiterator = this.menyer.iterator();

        while(menyiterator.hasNext()) {
            Meny meny = menyiterator.next();

            for(Rett rett : meny.getDishes()) {
                if(rett.getName().equalsIgnoreCase(Name)) {
                    return rett;
                }
            }
        }
        return null;
    }

    public ArrayList<Rett> finnType(String Type) {
        Iterator<Meny> mIterator = this.menyer.iterator();
        ArrayList<Rett> funnetListe = new ArrayList<>();

        while(mIterator.hasNext()) {
            Meny meny = mIterator.next();
            for(Rett d : meny.getDishes()) {
                if(d.getType().equalsIgnoreCase(Type)) {
                    funnetListe.add(d);
                }
            }
        }
        if(funnetListe.isEmpty()) {
            System.out.println("Fant ingen retter av denne typen.");
            return null;
        }
        return funnetListe;
    }

    public ArrayList<Meny> menyIntervall(double minPrice, double maxPrice) {
        Iterator<Meny> mIterator = this.menyer.iterator();
        ArrayList<Meny> funnetListe = new ArrayList<>();

        while(mIterator.hasNext()) {
            Meny meny = mIterator.next();
            if(meny.getPrice() > minPrice && meny.getPrice() < maxPrice) {
                funnetListe.add(meny);
            }
        }
        if(funnetListe.size() == 0) {
            System.out.println("Ingen menyer ligger i denne prisklassen.");
            return null;
        }
        return funnetListe;
    }

    public int numMeny() {
        return this.menyer.size();
    }

    public int numDish() {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < menyer.size(); i++) {
            for(int j = 0; j < menyer.get(i).getDishes().size(); j++) {
                String name = menyer.get(i).getDishes().get(j).getName();
                if(!list.contains(name)) {
                    list.add(name);
                }
            }
        }
        return list.size();
    }

    public String toString() {
        String text = "";
        for(Meny a : menyer) {
            text += a.toString()+"\n";
        }
        return text;
    }
}