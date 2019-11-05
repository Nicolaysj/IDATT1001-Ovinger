public final class Person{
    final String navn;
    final String etternavn;
    final int dato;

    public Person(String fNavn, String eNavn, int fDato){
        navn = fNavn;
        etternavn = eNavn;
        dato = fDato;
    }

    public String getNavn(){
        return navn + " " + etternavn;
    }


    public int getDato(){
        return dato;
    }
}