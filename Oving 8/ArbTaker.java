import java.util.Calendar;
import java.util.GregorianCalendar;



public class ArbTaker {
    private Person person;
    private int arbtakerNr;
    private int ansettelsesAar;
    private double maanedsLonn;
    private double skatteProsent;
    java.util.GregorianCalendar kalender = new GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);

    public ArbTaker(Person person, int arbNr, int ansAar, double mLonn, double sProsent) {
        this.person = person;
        this.arbtakerNr = arbNr;
        this.ansettelsesAar = ansAar;
        this.maanedsLonn = mLonn;
        this.skatteProsent = sProsent/100;
    }

    public String getNavn() {
        return person.etternavn + ", " + person.navn;
    }

    public int getArbtakerNr() {
        return arbtakerNr;
    }

    public int getAnsettelsesAar() {
        return ansettelsesAar;
    }

    public double getMaanedsLonn() {
        return maanedsLonn;
    }

    public double getSkatteProsent() {
        return skatteProsent;
    }

    public double getSkattetrekkMnd() {
        return maanedsLonn * skatteProsent;
    }

    public double getBrutto() {
        return maanedsLonn * 12;
    }

    public double getSkattetrekk() {
        return ((maanedsLonn * skatteProsent * 10) + ((maanedsLonn*skatteProsent)/2));
    }

    public int getAlder() {
        return aar-this.person.getDato();
    }

    public int getAarBedrift() {
        return aar-getAnsettelsesAar();
    }

    public void setArbtakerNr(int nyttArbtakerNr) {
        this.arbtakerNr = nyttArbtakerNr;
    }

    public void setAnsettelsesaar(int nyttAnsettelsesaar) {
        this.Ansettelsesaar = nyttAnsettelsesaar;
    }

    public void setMaanedsLonn(double nyMndLonn) {
        this.maanedsLonn = nyMndLonn;
    }

    public void setSkatteProsent(double nySkatteProsent) {
        this.skatteProsent = nySkatteProsent/100;
    }

    public String getLengerEnn(int tid) {
        if(tid<getAarBedrift()) {
            return getNavn() + " har vaert i bedriften lenger enn " + tid + "aar";
        } 
        else if(tid>getAarBedrift()){
            return getNavn() + " har ikke vaert i bedriften lenger enn " + tid + "aar";
        }
        else if(tid==getAarBedrift()){
            return getNavn() + " har vaert i bedriften like lenge.";
        }
    }


    
}