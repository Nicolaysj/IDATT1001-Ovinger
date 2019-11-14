import java.util.*;
import java.util.ArrayList;

public class Oving11 {

    public static Scanner s = new Scanner(System.in);

    public static Eiendom nr1 = new Eiendom(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen");
    public static Eiendom nr2 = new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen");
    public static Eiendom nr3 = new Eiendom(1446, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
    public static Eiendom nr4 = new Eiendom(1446, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Braaten");
    public static Eiendom nr5 = new Eiendom(1446, "Gloppen", 69, 47, "Hoeiberg", 1339.4, "Elsa Indregaard");
    public static ArrayList<Eiendom> estates = new ArrayList<>(Arrays.asList(nr1, nr2, nr3, nr4, nr5));

    public static void main(String [] args) {
    menu();
    }

    public static void menu() {
        EiendomsRegister realEstates = new EiendomsRegister(estates);

        while(true) {
            System.out.println("Velkommen til dette dritt programmet. Du kan naa velge mellom:\n" +
            "0. Avslutt\n" +
            "1. Registrere en ny eiendom\n" +
            "2. Skrive ut alle eiendommer som er registrert\n" + 
            "3. Soeke etter eiendom basert paa kommunoenr, gnr og bnr\n" +
            "4. Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret\n" + 
            "5. Fjerne en eiendom\n" + 
            "6. Skrive ut antall eiendommer\n" + 
            "7. Skriv ut alle eiendommer med et gaardsnummer"
            );
            
            int choice = s.nextInt();

            switch(choice) {
                case 0:
                    System.out.println("Avslutter...");
                    System.exit(0);
                    case 1:
                    System.out.println("Registrere en ny eiendom");
                    System.out.println("Kommune nr?");
                    int komNr = s.nextInt();
                    System.out.println("Kommune navn?");
                    s.nextLine();
                    String komNavn = s.nextLine();
                    System.out.println("gnr?");
                    int gnr = s.nextInt();
                    System.out.println("bnr?");
                    int bnr = s.nextInt();
                    s.nextLine();
                    System.out.println("Bruksnavn?");
                    String bruksNavn = s.nextLine();
                    System.out.println("Areal?");
                    double areal = s.nextDouble();
                    System.out.println("Eier?");
                   // s.nextLine();
                    String eier = s.nextLine();
                    System.out.println("Registrerte en " + realEstates.newRealEstate(komNr, komNavn, gnr, bnr, bruksNavn, areal, eier));
                    break;
                case 2:
                    System.out.println("Skrive ut alle eiendommer som er registrert");
                    System.out.println(realEstates.listAll().toString());
                    break;
                case 3:
                    System.out.println("Soeke etter eiendom basert paa kommunoenr, gnr og bnr");
                    System.out.println("Kommune nr?");
                    komNr = s.nextInt();
                    System.out.println("Gnr?");
                    gnr = s.nextInt();
                    System.out.println("Bnr?");
                    bnr = s.nextInt();
                    System.out.println(realEstates.listWNum(komNr, gnr, bnr).toString());
                    break;
                case 4:
                    System.out.println("Regne ut og vise gjennomsnitts areal av alle eiendommene i registeret");
                    System.out.println("Arealet er " + realEstates.avgArea());
                    break;
                case 5:
                    System.out.println("Fjerne en eiendom");
                    System.out.println("Skriv inn Kommune nr?");
                    komNr = s.nextInt();
                    System.out.println("Gnr?");
                    gnr = s.nextInt();
                    System.out.println("Bnr?");
                    bnr = s.nextInt();
                    System.out.println(realEstates.delRealEstate(komNr, gnr, bnr));
                    break;
                case 6:
                    System.out.println("\nAntall eiendommer er: " + realEstates.numReal() + "\n");
                    break;
                case 7:
                    System.out.println("Finn eiendommer med et gaardsnummer");
                    System.out.println("Hvilket gaardsnummer vil du bruke?");
                    gnr = s.nextInt();
                    System.out.println("Fant foelgende eiendommer: \n" + realEstates.findAllGnr(gnr).toString());
                    break;
                default: 
                    System.out.println("Du skrev inn noe feil...");
                    continue;
            }
        }
    }
}