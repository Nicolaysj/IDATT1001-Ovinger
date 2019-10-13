public final class NyString {
    private final String INPUT;

    public NyString(String INPUT) {
        this.INPUT = INPUT;
    }

    // Forkorting. Forkortingen skal skje ved at første tegn i hvert ord plukkes ut.
    public String forkort() {
        StringBuilder str = new StringBuilder();
        String[] ordLst = this.INPUT.split(" ");

        for (String i : ordLst) {
            str.append(i.charAt(0));
        }

        return str.toString();
    }

    // Fjerning av tegn.
    public String fjernBokstav(String bokstav) {
        StringBuilder str = new StringBuilder(this.INPUT);
        for (int i=0; i<str.length();i++) {
            if (!(this.INPUT.contains(bokstav)) || str.indexOf(bokstav) == -1) {
                break;
            }
            str = str.deleteCharAt(str.indexOf(bokstav));
        }

        return str.toString();
    }

    public String getInput() {
        return INPUT;
    }
}