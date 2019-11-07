public class Arrangement {

    private int ArgNr;
    private long Date;
    private String ArgName, Location, Organizer, ArgType;


    public Arrangement(int ArgNr, String ArgName, String Loc, String Org, String ArgType, long Date) {
        this.ArgNr = ArgNr;
        this.ArgName = ArgName;
        this.Location = Loc;
        this.Organizer = Org;
        this.ArgType = ArgType;
        this.Date = Date;
    }

    public int getArgNr() {
        return ArgNr;
    }

    public String getArgName() {
        return ArgName;
    }

    public String getLocation() {
        return Location;
    }

    public String getOrganizer() {
        return Organizer;
    }

    public String getArgType() {
        return ArgType;
    }

    public long getDate() {
        return Date;
    }

    public String toString() {
        return ("\nNavn: " + getArgName() + "\nArrangement nummer: " + getArgNr() + 
        "\nSted: " +  getLocation() + "\nType: " +  getArgType() + "\nDato: " + getDate() + "\nArrangoer: " + getOrganizer());
    }
}