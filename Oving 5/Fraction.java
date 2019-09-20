public class Fraction{

    private int num; //teller
    private int denom; //nevner

    public Fraction(int num, int denom){
        this.num = num;
        this.denom = denom;

        if (denom==0){
            throw new IllegalArgumentException("ugyldig verdi i nevner.");
        }
    }

    public Fraction(int n){
        this.num = n;
        this.denom = 1;
    }
    public int getNum() {
        return num;
    }
    public int getDenom() {
        return denom;
    }


    String Multiply(Fraction fraction){
        return (fraction.getNum() + "/" + fraction.getDenom() + " * " + this.num + "/" + this.denom + " = " +
        (fraction.getNum()*this.denom) + "/" + (fraction.getDenom()*this.num));
    }
    String Addition(Fraction fraction){
        return (fraction.getNum() + "/" + fraction.getDenom() + " + " + this.num + "/" + this.denom + " = " +
        ((fraction.getNum()*this.denom)+(fraction.getDenom()*this.num)) + "/" + (fraction.getDenom()*this.denom));
    }
    String Subtraction(Fraction fraction){
        return (this.num + "/" + this.denom + " - " + fraction.getNum() + "/" + fraction.getDenom() + " = " +
        ((fraction.getDenom()*this.num)-(fraction.getNum()*this.denom)) + "/" + (fraction.getDenom()*this.denom));
    }
    String Division(Fraction fraction){
        return (fraction.getNum() + "/" + fraction.getDenom() + " / " + this.num + "/" + this.denom + " = " +
        (fraction.getNum()*this.num) + "/" + (fraction.getDenom()*this.denom));
    }
    


    

}