import javax.swing.JOptionPane; 

class Oving2_2 {
	public static void main(String[] args) {
		String kg;
		kg = JOptionPane.showInputDialog("Sett inn antall kg kjøtt");
		double result = Double.parseDouble(kg);
		double kA = (35.9/450);
		double kB = (39.5/500);
			
		System.out.println("Kjøtt av merke A koster "+(result*1000*kA)+" kr, mens kjøtt av merke B koster "+(result*1000*kB)+" kr.");
	}
}