import static javax.swing.JOptionPane.*;

public class Oving5_1{
    public static void main(String[] args) {

        String numerator = showInputDialog("Sett inn teller");
            int num = Integer.parseInt(numerator);

        String denomenator = showInputDialog("Sett inn nevner");
            int denom = Integer.parseInt(denomenator);
        
        String numerator2 = showInputDialog("Sett inn teller for brøk 2");
            int num2 = Integer.parseInt(numerator2);

        String denomenator2 = showInputDialog("Sett inn nevner for brøk 2");
            int denom2 = Integer.parseInt(denomenator2);

            Fraction fraction = new Fraction(num, denom);
            Fraction fraction2 = new Fraction(num2, denom2);

            String input = showInputDialog("Hvilken regneoperasjon vil du bruke?\r\n1. +\r\n2. -\r\n3. *\r\n4. /");
                    int i = Integer.parseInt(input);	
                    
            switch (i) {
                case 1:
                  System.out.println(fraction.Addition(fraction2));
                  break;
                case 2:
                  System.out.println(fraction.Subtraction(fraction2));
                  break;
                case 3:
                  System.out.println(fraction.Multiply(fraction2));
                  break;
                case 4:
                  System.out.println(fraction.Division(fraction2));
                  break;
        
            }
    } //end main

} //end class