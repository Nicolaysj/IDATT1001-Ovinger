import java.util.*;

public class Arrangement {

    private int ArgNr, ArgType, Date;
    private String ArgName, Location, Organizer;
    //private String Location;
    //private String Organizer;
    //private int ArgType;
    //private int Date;


    public Arrangement(int ArgNr, String ArgName, String Loc, String Org, int ArgType, int Date) {
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

    public int getArgType() {
        return ArgType;
    }

    public int getDate() {
        return Date;
    }

    public String toString() {
        return ("\nNavn: " + getArgName() + "\nArrangement nummer: " + getArgNr() + 
        "\nSted: " +  getLocation() + "\nType: " +  getArgType() + "\nDato: " + getDate() + "\nArrangør: " + getOrganizer());
    }
}