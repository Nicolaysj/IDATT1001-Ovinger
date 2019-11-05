import java.util.Scanner;


public class Oving8_1 {

private static Scanner s = new Scanner(System.in);

    public static void main(String [] args) {
            meny();
        } //end main
        
        public static ArbTaker nyPerson() {
        System.out.println("Fornavn: ");
        String fNavn = s.nextLine();
        System.out.println("Etternavn: ");
        String eNavn = s.nextLine();
        System.out.println("Fodselsaar: ");
        int fDato = s.nextInt();
        Person person1 = new Person(fNavn, eNavn, fDato);
        System.out.println("Arbeidstakernr: ");
        int arbNr = s.nextInt();
        System.out.println("Ansettelsesaar: ");
        int ansetaar = s.nextInt();
        System.out.println("Maanedslonn: ");
        double mndLonn = s.nextDouble();
        System.out.println("Skatteprosent: ");
        double skatteprosent = s.nextDouble();
        ArbTaker Arbtaker1 = new ArbTaker(person1, arbNr, ansetaar, mndLonn, skatteprosent);
        return Arbtaker1;
        } //end nyPerson


        public static void meny() {
        ArbTaker arbtaker = nyPerson();
        while(true) {
            System.out.println("Menyen:\n" + 
                                "0. Avslutt\n" +
                                "1. Endre skatteprosent\n" +
                                "2. Endre maanedslonn\n" + 
                                "3. Endre annsettelsesaar og arbeidstakernr\n" + 
                                "4. Ansattinformasjon\n" +
                                "6. Har person vaert ansatt i mer en x antall aar?");
            int valg = s.nextInt();
            switch(valg) {
                case 0: 
                    System.out.println("Avslutter....");
                    System.exit(0);
                case 1:
                    System.out.println("Ny skatteprosent");
                    double nySkatteProsent = s.nextDouble();
                    arbtaker.setSkatteProsent(nySkatteProsent);
                    System.out.println("Ny skatteprosent ble satt");
                    break;
                case 2:
                    System.out.println("Ny maanedslonn:");
                    double nyMLonn = s.nextDouble();
                    arbtaker.setMaanedslonn(nyMLonn);
                    System.out.println("Ny maanedslonn ble satt");
                    break;
                case 3:
                    System.out.println("Nytt ansettelsesaar");
                    int nyttAnsettelsesaar = s.nextInt();
                    arbtaker.setAnsettelsesaar(nyttAnsettelsesaar);
                    System.out.println("Ansettelsesaar ble endret, hva er nytt arbeidstakernr?");
                    int nyttArbtakerNr = s.nextInt();
                    arbtaker.setArbtakerNr(nyttArbtakerNr);
                    System.out.println("Arbeidstakernr ble endret");
                    break;
                case 4: 
                    visAnsattInfo(arbtaker);
                    break;
                case 5:
                    System.out.println("Hvor mange aar?");
                    int tid = s.nextInt();
                    System.out.println(arbtaker.getLengerEnn(tid));
                default: 
                    System.out.println("Du skrev noe feil, prov paa nytt.");
                    continue;
            }
        }
        } //end meny

        public static void visAnsattInfo(ArbTaker arbtaker) {
        System.out.println("Arbeidstakernr: " + arbtaker.getArbtakerNr());
        System.out.println("Maanedslonn: " + arbtaker.getMaanedsLonn());
        System.out.println("Skatteprosent: " + arbtaker.getSkatteProsent());
        System.out.println("Ansettelsesaar: " + arbtaker.getAnsettelsesAar());
        System.out.println("Aar i brediften: " + arbtaker.getAarBedrift());
        System.out.println("Alder: " + arbtaker.getAlder());
        System.out.println("Bruttolonn: " + arbtaker.getBrutto());
        System.out.println("Navn: " + arbtaker.getNavn());
        System.out.println("Skatt per aar: " + arbtaker.getSkattetrekk());
        System.out.println("Skatt per mnd: " + arbtaker.getSkattetrekkMnd());        
    }


}
