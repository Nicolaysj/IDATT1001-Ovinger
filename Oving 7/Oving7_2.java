import java.util.Scanner;

public class Oving7_2 {

    private static Analyse s = new Analyse("Hopp opp. Hopp ned. Snu deg rundt. Alle sammen har det gøy.");

    public static void main(String[] args) {
        System.out.println("\r\nDet er: " + s.antOrd() + " ord.");
        System.out.println("\r\nDen gjennomsnittlige lengden på orden er: " + s.gjenOrd());
        System.out.println("\r\nDet er gjennomsnittlig: " + s.gjenLengde() + " ord per periode.");
        System.out.println("\r\n"+s.skiftOrd("min", "din"));
        System.out.println("\r\nTeksten er: " + s.getText());
        System.out.println("\r\nTeksten i caps: " + s.printTekstStor());

        
    }




}

