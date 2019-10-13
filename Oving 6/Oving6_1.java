import java.util.Random;

    public class Oving6_1{
        public static void main(String[] args) {
            
            Random random = new Random();
            int[] antall = new int[10];

            for (int i=0; i<=1000; i++){
                int tall = random.nextInt(10);
                antall[tall]++;
            }//end for-løkke

            int a=0;
            for (int x:antall){
                System.out.println((a++)+1 + ": " + x);
            }//end for-løkke
        }//end main
    }//end class