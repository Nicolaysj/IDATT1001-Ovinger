import javax.swing.JOptionPane; 

class Oving1_3 {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Sett inn antall sekunder");
		int seconds = Integer.parseInt(result);
		int hours = (seconds / 3600);
		int minutes = ((seconds % 3600)/60);
		int finalseconds = (seconds % 60);
		
		System.out.println(result + " sekunder = " + hours + " timer, " + minutes + " minutter, " + finalseconds + " sekunder.");
	}
}