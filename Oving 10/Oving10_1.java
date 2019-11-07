import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        Arrangement a1 = new Arrangement(1, "Konsert", "Spektrum", "Konsertprodusent", "Konsert", 201901011800L);
        Arrangement a2 = new Arrangement(2, "Disco", "Bodega", "UKA", "Fest", 202001010000L);
        Arrangement a3 = new Arrangement(3, "Rave", "Bodega", "Tihlde", "Fest", 202001012000L);
        Arrangement a4 = new Arrangement(4, "Fest", "Spektrum", "Tihlde", "Bedpres", 202101022200L);
        Arrangement a5 = new Arrangement(5, "Vinsmaking", "Scandic", "Kildevangen", "Bedpres", 201001022200L);

        ArrangementRegister oversikt = new ArrangementRegister();

        Arrangementer.registrer(a1);
        Arrangementer.registrer(a2);
        Arrangementer.registrer(a3);
        Arrangementer.registrer(a4);
        Arrangementer.registrer(a5);

        String[]muligheter = {"Sorter sted", "Sorter type", "Sorter tidspunkt", "Skjekk sted", "Skjekk dato", "Skjekk mellom 2 datoer", "Avslutt"};

        while (true){
            int valg = showOptionDialog(null, "Hva vil du gjøre?", "Øving 10 a", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);
            switch (valg) {
                case 0:
                    showMessageDialog(null, "Steder sortert:\n" + oversikt.sorterSted());
                    break;
                case 1:
                    showMessageDialog(null, "Typer sortert:\n" + oversikt.sorterType());
                    break;
                case 2:
                    showMessageDialog(null,"Tidspunkt sortert:\n" + oversikt.sorterTidspunkt());
                    break;
                case 3:
                    String sted = showInputDialog(null, "Skriv inn et sted" + oversikt.stedNavn());
                    showMessageDialog(null," Arrangementer på " + sted + " er " + oversikt.finnSted(sted));
                    break;
                case 4:
                    long dato = Long.parseLong(showInputDialog(null, "Velg dato"));
                    showMessageDialog(null, "Arrangementene på dato " + dato + " er: " + oversikt.finnDato(dato));
                    break;
                case 5:
                    int dato1 = Integer.parseInt(showInputDialog(null,"Skriv inn dato 1"));
                    int dato2 = Integer.parseInt(showInputDialog(null,"Skriv inn dato 2"));
                    showMessageDialog(null, " Arrangementene mellom " + dato1 + " og " + dato2 + " er " + oversikt.Intervall(dato1, dato2));
                    break;
                default:
                    return;
            }
        }
    }
}