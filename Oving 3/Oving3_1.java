//Øving 3_1 - Program som skal l bruker 

	import static javax.swing.JOptionPane.*;

		class Oving3_1 {
			public static void main(String[] args){
				
				
				showMessageDialog(null, "Velg tall du ønsker å finne gangetabellene mellom");
				
				//Brukeren skriver inn fra tallet
				String fraInput = showInputDialog("Fra");
				
				//Brukeren skriver inn fra tallet
				String tilInput = showInputDialog("Til");
				
				//Tallene gjøres om fra String til int
				int fra = Integer.parseInt(fraInput);
				int til = Integer.parseInt(tilInput);
				
				//Lager en for-løkke som starter med start-verdien og ender med slutt-verdien brukeren satt inn, og øker med 1
				for (int n=fra; n<=til; n++) {				
					//Lager en for-løkke som skal brukes for tallet n skal ganges med, altså fra 1 til 10, og øker med 1 for hver
					for(int i=1;i<=10; i++) {
						//Programmet skriver ut regnestykkene
						System.out.println(n + "*" + i + "=" + (n*i));
					}
				}
			}
		}