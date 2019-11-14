public class Eiendom {

    private int komNr, gnr, bnr;
    private double areal;
    private String komNavn, bruksNavn, eier;


    public Eiendom(int komNr, String komNavn, int gnr, int bnr, String bruksNavn, double areal, String eier) {
        this.komNr = komNr;
        this.gnr = gnr;
        this.bnr = bnr;
        this.areal = areal;
        this.komNavn = komNavn;
        this.bruksNavn = bruksNavn;
    }

    public int getKomNr() {
        return komNr;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public double getAreal() {
        return areal;
    }

    public String getKomNavn() {
        return komNavn;
    }

    public String getBruksNavn() {
        return bruksNavn;
    }

    public String getEier() {
        return eier;
    }

    public void setbruksNavn(String bruksNavn) {
        this.bruksNavn = bruksNavn;
    }

    public void setEier(String eier) {
        this.eier = eier;
    }

    public String toString() {
        return ("\nKommune: " + getKomNavn()
                + "\nEier: " +  getEier()
                + "\nPlass ID: " + getKomNr() + "-" + getGnr() + "/" + getBnr()
                + "\nNavn: " +  getBruksNavn() 
                + "\nAreal: " +  getAreal());
    }
}