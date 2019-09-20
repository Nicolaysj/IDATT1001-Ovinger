import java.util.Random;

public class MinRandom {
    private Random r;

    public MinRandom() {
        this.r = new Random();
    }

    public int nesteHeltall(int bunn, int topp) {
        return this.r.nextInt(topp  + 1 - bunn) + bunn;
    }


    public double nesteDesimaltall(double bunn, double topp) {
        return r.nextDouble() * (topp - bunn) + bunn;
    }
}