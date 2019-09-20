import javax.swing.JOptionPane; 

class Oving1 {
	public static void main(String[] args) {
		String tommer;
		tommer = JOptionPane.showInputDialog("Sett inn tommer du vil gjøre om til cm");
		float result = Float.parseFloat(tommer);
		
		System.out.println(tommer + " tommer omgjort til cm = " + result * 2.54 + "cm");
	}
}