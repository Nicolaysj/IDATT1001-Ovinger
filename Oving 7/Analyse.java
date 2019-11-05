public class Analyse {
    private final String Text;

    public Analyse(String text) {
        this.Text = text;
    }

    // • Å hente ut teksten slik den står, uten endringer.
    public String getText() {
        return Text;
    }

    // • Å hente ut teksten, men slik at alle bokstaver er store.
    public String printTekstStor() {
        return this.getText().toUpperCase();
    }

    // • Å finne antall ord i teksten.
    public int antOrd() {
        String[] text = this.getText().split("[\\s@&.,!?$+-]+"); //alt unntatt symboler
        return text.length;
    }

    // • Å finne gjennomsnittlig ordlengde.
    public int gjenOrd() {
        String[] text = this.getText().split("[\\s@&.,!?$+-]+");
        int gjSnitt = 0;

        for (String i : text) {
            gjSnitt += i.length();
        }

        return gjSnitt / text.length;
    }

    /*
    Å finne gjennomsnittlig antall ord per periode. Bruk punktum, utropstegn,
        kolon og spørretegn som skilletegn mellom periodene.
        Anta at teksten er feilfri, slik at ikke to eller flere slike tegn følger etter hverandre.
     */
    // simple is always better
    public int gjenLengde() {
        //List<List<String>> lst = new ArrayList<>();
        String[] setning = (this.getText().split("[.:!?-]+"));

        int antallOrd = 0;

        for (int i=0; i<setning.length; i++){
            int teller = setning[i].split(" ").length;
            antallOrd+=teller;
        }
        

        return antallOrd/setning.length;
    }

    /*
    • Å skifte ut et ord med et annet gjennom hele teksten.
        For eksempel kan en ønske å skifte ut ordet «finnes» med «fins».
     */
    public String skiftOrd(String originalOrd, String annetOrd) {
        String[] textArr = this.Text.split("[\\s@&.,!?$+-]+");

        for (int i=0; i<textArr.length; i++) {
            if (textArr[i].equalsIgnoreCase(originalOrd)) {
                textArr[i] = annetOrd;
            }
        }
        return String.join(" ", textArr);
    }
}