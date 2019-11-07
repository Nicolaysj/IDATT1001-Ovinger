import static javax.swing.JOptionPane.*;

public class Oving10_1 {
    public static void main(String[] args) {

        Arrangement a1 = new Arrangement(1, "John Mayer", "Oslo Spektrum", "JM Productions", "Konsert", 201910032000L);
        Arrangement a2 = new Arrangement(2, "John Mayer", "Trondheim Spektrum", "JM Productions", "Konsert", 201910042000L);
        Arrangement a3 = new Arrangement(3, "Hawaiitur", "Oahu, Hawaii", "Familytrips", "Reise", 201912211000L);
        Arrangement a4 = new Arrangement(4, "Botfest", "Der det skjer", "Tihlde Pythons", "Botfest", 202001022200L);
        Arrangement a5 = new Arrangement(5, "Julebord", "Rockheim", "Tihlde", "Sosialt", 201911212000L);

        ArrangementRegister Arrangementer = new ArrangementRegister();

        Arrangementer.Registrer(a1);
        Arrangementer.Registrer(a2);
        Arrangementer.Registrer(a3);
        Arrangementer.Registrer(a4);
        Arrangementer.Registrer(a5);

        String[]muligheter = {"Sorter sted", "Sorter type", "Sorter tidspunkt", "Skjekk sted", "Skjekk dato", "Skjekk mellom 2 datoer", "Avslutt"};

        while (true){
            int valg = showOptionDialog(null, "Hva vil du gjoere?", "oeving 10 a", 0, QUESTION_MESSAGE, null, muligheter, muligheter[0]);
            switch (valg) {
                case 0:
                    showMessageDialog(null, "Steder sortert:\n" + Arrangementer.sorterSted());
                    break;
                case 1:
                    showMessageDialog(null, "Typer sortert:\n" + Arrangementer.sorterType());
                    break;
                case 2:
                    showMessageDialog(null,"Tidspunkt sortert:\n" + Arrangementer.sorterTidspunkt());
                    break;
                case 3:
                    String sted = showInputDialog(null, "Skriv inn et sted" + Arrangementer.stedNavn());
                    showMessageDialog(null," Arrangementer - " + sted + " er " + Arrangementer.finnSted(sted));
                    break;
                case 4:
                    long dato = Long.parseLong(showInputDialog(null, "Velg dato"));
                    showMessageDialog(null, "Arrangementene paa dato " + dato + " er: " + Arrangementer.finnDato(dato));
                    break;
                case 5:
                    long dato1 = Long.parseLong(showInputDialog(null,"Skriv inn dato 1"));
                    long dato2 = Long.parseLong(showInputDialog(null,"Skriv inn dato 2"));
                    showMessageDialog(null, " Arrangementene mellom " + dato1 + " og " + dato2 + " er " + Arrangementer.Intervall(dato1, dato2));
                    break;
                default:
                    return;
            }
        }
    }
}