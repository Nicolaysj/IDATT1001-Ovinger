import java.util.*;


public class ArrangementRegister{

    private ArrayList<Arrangement> Arrangementer;

    public ArrangementRegister() {
        this.Arrangementer = new ArrayList<Arrangement>(); //Lager liste med Arrangementene
    }

    public void Registrer() {
        Arrangementer.add(nyttArrangement);
    }

    public ArrayList<String> stedNavn() {
        ArrayList<String> nyListe = new ArrayList<>();
        for (int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(String.valueOf(Arrangementer.get(i).getSted()));
        }
        return nyListe;
    }

    public ArrayList<String> finnSted(String sted) {
     ArrayList<String> nyListe = new ArrayList<String>();
        for (int i = 0; i < Arrangementer.size(); i++) {
            if (Arrangementer.get(i).getSted().equals(sted)) {
                nyListe.add(Arrangementer.get(i).getNavn());
            }
        }
        return nyListe;
    }

    public ArrayList<String> finnDato (long dato) {
        ArrayList<String> nyListe = new ArrayList<String>();
        for (int i = 0; i < Arrangementer.size(); i++){
            if (dato == Arrangementer.get(i).getTidspunkt()/10000) {
                nyListe.add(Arrangementer.get(i).getNavn());
            }
        }
        return nyListe;
    }

    public ArrayList<String> Intervall (int dato1, int dato2){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                if (a1.getTidspunkt() == a2.getTidspunkt()){
                    return 0;
                }
                return a1.getTidspunkt() < a2.getTidspunkt() ? -1: 1;
            }
        });
        for (int i = 0; i < Arrangementer.size(); i++){
            if (dato1 <= Arrangementer.get(i).getTidspunkt()/10000 && dato2 >= Arrangementer.get(i).getTidspunkt()/10000){
                nyListe.add(Arrangementer.get(i).getNavn());
            }
        }
        return nyListe;
    }

    public ArrayList<String> sorterSted(){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                return a1.getSted().compareTo(a2.getSted());
            }
        });
        for(int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(Arrangementer.get(i).getNavn() + " på " + Arrangementer.get(i).getSted());
        }
        return nyListe;
    }

    public ArrayList<String> sorterType(){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                return a1.getType().compareTo(a2.getType());
            }
        });
        for(int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(Arrangementer.get(i).getNavn() + " (" + Arrangementer.get(i).getType() + ") " );
        }
        return nyListe;
    }

    public ArrayList<String> sorterTidspunkt(){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                if (a1.getTidspunkt() == a2.getTidspunkt()){
                    return 0;
                }
                return a1.getTidspunkt() < a2.getTidspunkt() ? -1: 1;
            }
        });
        for(int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(Arrangementer.get(i).getNavn() + " (" + Arrangementer.get(i).getTidspunkt() + ") " );
        }
        return nyListe;
    }



    public String toString () {
        return " " + Arrangementer + " ";
    }

    
    




}