import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] argv) throws Exception {

    String[] buttons = { "Yes", "Yes to all", "No", "Cancel" };

    int rc = JOptionPane.showOptionDialog(null, "Question ?", "Confirmation",
        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

    System.out.println(rc);

  }
}




private double nok=1;
private double usd=0.111088;
private double eur=0.100080181;
private double sek=1.07510065;