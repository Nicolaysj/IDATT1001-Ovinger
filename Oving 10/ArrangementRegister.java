import java.util.*;


public class ArrangementRegister{

    private List<Arrangement> Arrangementer;

    public ArrangementRegister() {
        this.Arrangementer = new ArrayList<Arrangement>(); //Lager liste med Arrangementene
    }

    public void Registrer(Arrangement nyttArrangement) {
        Arrangementer.add(nyttArrangement);
    }

    public ArrayList<String> stedNavn() {
        ArrayList<String> nyListe = new ArrayList<>();
        for (int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(String.valueOf(Arrangementer.get(i).getLocation()));
        }
        return nyListe;
    }

    public ArrayList<String> finnSted(String sted) {
     ArrayList<String> nyListe = new ArrayList<String>();
        for (int i = 0; i < Arrangementer.size(); i++) {
            if (Arrangementer.get(i).getLocation().equals(sted)) {
                nyListe.add(Arrangementer.get(i).getArgName());
            }
        }
        return nyListe;
    }

    public ArrayList<String> finnDato (long dato) {
        ArrayList<String> nyListe = new ArrayList<String>();
        for (int i = 0; i < Arrangementer.size(); i++){
            if (dato == Arrangementer.get(i).getDate()) {
                nyListe.add(Arrangementer.get(i).getArgName());
            }
        }
        return nyListe;
    }

    public ArrayList<String> Intervall (long dato1, long dato2){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                if (a1.getDate() == a2.getDate()){
                    return 0;
                }
                return a1.getDate() < a2.getDate() ? -1: 1;
            }
        });
        for (int i = 0; i < Arrangementer.size(); i++){
            if (dato1 <= Arrangementer.get(i).getDate() && dato2 >= Arrangementer.get(i).getDate()){
                nyListe.add(Arrangementer.get(i).getArgName());
            }
        }
        return nyListe;
    }

    public ArrayList<String> sorterSted(){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                return a1.getLocation().compareTo(a2.getLocation());
            }
        });
        for(int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(Arrangementer.get(i).getArgName() + " - " + Arrangementer.get(i).getLocation());
        }
        return nyListe;
    }

    public ArrayList<String> sorterType(){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                return a1.getArgType().compareTo(a2.getArgType());
            }
        });
        for(int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(Arrangementer.get(i).getArgName() + " (" + Arrangementer.get(i).getArgType() + ") " );
        }
        return nyListe;
    }

    public ArrayList<String> sorterTidspunkt(){
        ArrayList<String> nyListe = new ArrayList<String>();
        Collections.sort(this.Arrangementer, new Comparator<Arrangement>() {
            public int compare(Arrangement a1, Arrangement a2) {
                if (a1.getDate() == a2.getDate()){
                    return 0;
                }
                return a1.getDate() < a2.getDate() ? -1: 1;
            }
        });
        for(int i = 0; i < Arrangementer.size(); i++){
            nyListe.add(Arrangementer.get(i).getArgName() + " (" + Arrangementer.get(i).getDate() + ") " );
        }
        return nyListe;
    }



    public String toString () {
        return " " + Arrangementer + " ";
    }

    
    




}