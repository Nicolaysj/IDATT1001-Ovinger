public class Fraction{

    private int num; //teller
    private int denom; //nevner

    public Fraction(int n, int d){
        num = n;
        denom = d;
    }

    public Fraction2(int n){
        num = n;
    }

    public String getFraction() {
        return (num / denom);
    }

    public String getFraction2() {
        return (num / 1);
    }




}