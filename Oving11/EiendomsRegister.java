import java.util.*;
import java.util.ArrayList;

public class EiendomsRegister {

    private ArrayList<Eiendom> realEstates = new ArrayList<>();

    public EiendomsRegister(ArrayList<Eiendom> realEstates) {
        this.realEstates = realEstates;
    }

    public Eiendom newRealEstate(int komNr, String komNavn, int gnr, int bnr, String bruksNavn, double areal, String eier) {
        Eiendom newReal = new Eiendom(komNr, komNavn, gnr, bnr, bruksNavn, areal, eier);
        realEstates.add(newReal);
        return newReal;
    }

    public String delRealEstate(int komNr, int gnr, int bnr) {

        Eiendom r = listWNum(komNr, gnr, bnr);
        System.out.println(r);
        if(r == null) {
            return "Noe gikk galt, fant ikke eiendommen...\n";
        }
        realEstates.remove(r);
        return "Slettet!";

    }

    public int numReal() {
        return realEstates.size();
    }

    public ArrayList listAll() {
        return realEstates;
    }

    public Eiendom listWNum(int komNr, int gnr, int bnr) {
        Iterator<Eiendom> iterator = realEstates.iterator();

        while(iterator.hasNext()) {
            Eiendom nEstate = iterator.next();
            if(nEstate.getKomNr() == komNr && nEstate.getGnr() == gnr && nEstate.getBnr() == bnr) {
                return nEstate;
            }
        }
        return null;

    }

    public ArrayList findAllGnr(int gnr) {
        ArrayList<Eiendom> rEstates = new ArrayList<>();
        Iterator<Eiendom> iterator = realEstates.iterator();

        while(iterator.hasNext()) {
            Eiendom n = iterator.next();
            if(n.getGnr() == gnr) {
                rEstates.add(n);
            }
        }
        if(rEstates.isEmpty()) {
            return null;
        }

        return rEstates;
    }

    public double avgArea() {
        Iterator<Eiendom> iterator = realEstates.iterator();
        double totArea = 0;

        while(iterator.hasNext()) {
            Eiendom e = iterator.next();
            totArea += e.getAreal();
        }

        return totArea/realEstates.size();
    }
}