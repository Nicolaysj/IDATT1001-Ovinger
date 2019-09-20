//Dette programmet sjekker om et vilkårlig årstall er et skuddår. Øving 2_1
import static javax.swing.JOptionPane.*;

class Oving2_1 {
	public static void main(String[] args){
		
		//Brukeren skriver inn et årstall
		String yearRead = showInputDialog("Sett inn årstall: ");

		/*Tallet gjøres om fra String til int*/
		int year = Integer.parseInt(yearRead);

		if(year > 0){
			/*Sjekke om årstallet er delelig med 4 (og om hundreårene er delelig med 400)*/
			if(year%4 != 0){
				showMessageDialog(null, "Året er ikke et skuddår.");
			} else if (year%100 != 0){
				showMessageDialog(null, "Året er et skuddår.");
			} else if (year%400 != 0){
				showMessageDialog(null, "Året er ikke et skuddår.");
			}else{
				showMessageDialog(null, "Året er et skuddår.");
			}
		} else {
			showMessageDialog(null, "Du må skrive inn et positivt år.");
		}
	}
}