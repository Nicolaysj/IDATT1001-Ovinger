import java.util.*;
import java.util.ArrayList;

public class RealEstateReg {

    private ArrayList<RealEstate> realEstates = new ArrayList<>();

    public RealEstateReg(ArrayList<RealEstate> realEstates) {
        this.realEstates = realEstates;
    }

    public RealEstate newRealEstate(int komNr, String komNavn, int gnr, int bnr, String bruksNavn, double areal, String eier) {
        RealEstate newReal = new RealEstate(komNr, komNavn, gnr, bnr, bruksNavn, areal, eier);
        realEstates.add(newReal);
        return newReal;
    }

    public String delRealEstate(int komNr, int gnr, int bnr) {

        RealEstate r = listWNum(komNr, gnr, bnr);
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

    public RealEstate listWNum(int komNr, int gnr, int bnr) {
        Iterator<RealEstate> iterator = realEstates.iterator();

        while(iterator.hasNext()) {
            RealEstate nEstate = iterator.next();
            if(nEstate.getKomNr() == komNr && nEstate.getGnr() == gnr && nEstate.getBnr() == bnr) {
                return nEstate;
            }
        }
        return null;

    }

    public ArrayList findAllGnr(int gnr) {
        ArrayList<RealEstate> rEstates = new ArrayList<>();
        Iterator<RealEstate> iterator = realEstates.iterator();

        while(iterator.hasNext()) {
            RealEstate n = iterator.next();
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
        Iterator<RealEstate> iterator = realEstates.iterator();
        double totArea = 0;

        while(iterator.hasNext()) {
            RealEstate e = iterator.next();
            totArea += e.getArea();
        }

        return totArea/realEstates.size();
    }
}