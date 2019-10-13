import javax.swing.JOptionPane; 

class Oving1_2 {
	public static void main(String[] args) {
		String timer, minutter, sekunder, avg;
		timer = JOptionPane.showInputDialog("Sett inn timer");
		minutter = JOptionPane.showInputDialog("Sett inn minutter");
		sekunder = JOptionPane.showInputDialog("Sett inn sekunder");
		int restimer = Integer.parseInt(timer);
		int resminutter = Integer.parseInt(minutter);
		int ressekunder = Integer.parseInt(sekunder);
		
		System.out.println(timer + " timer, " + minutter + " minutter, " + sekunder + " sekunder = " + (restimer*3600 + resminutter*60 + ressekunder) + " sekunder");
	}
}