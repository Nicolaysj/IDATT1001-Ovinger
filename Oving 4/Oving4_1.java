//Øving 4_1 - Program der bruker skal kunne velge valuta og sette inn beløp og få skrevet ut omregningen

	import static javax.swing.JOptionPane.*;

		public class Oving4_1 {
			public static void main(String[] args){
				
				Valuta nok = new Valuta("nok", 1, " norske kroner");
				Valuta usd = new Valuta("usd", 0.111088, " dollar");
				Valuta eur = new Valuta("eur", 0.100080181, " euro");
				Valuta sek = new Valuta("sek", 1.07510065, " svenske kroner");
				
				String in = showInputDialog("Hvor mye penger ønsker du å konvertere?");
				int tall = Integer.parseInt(in);
				
				String fraTil = showInputDialog("Hvilken kurs vil du gjøre om fra? \r\n1. Fra NOK\r\n2. Fra USD\r\n3. Fra EURO\r\n4. Fra SEK");
				int n = Integer.parseInt(fraTil);	
				
				if (n==1){
					String til = showInputDialog("Hvilken kurs vil du gjøre om til?\r\n1. USD\r\n2. EURO\r\n3. SEK");
					int m = Integer.parseInt(til);	
							
					if (m==1){
						System.out.println(usd.regnOm(tall));
					
					} else if (m==2){
						System.out.println(eur.regnOm(tall));
					
					} else if (m==3){
						System.out.println(sek.regnOm(tall));
					
					} else {
						System.out.println("Du har valgt en ugyldig verdi.");
					}

				} else if (n==2){
					System.out.println(usd.regnOm2(tall));
				
				} else if (n==3){
					System.out.println(eur.regnOm2(tall));
					
				} else if (n==4){
					System.out.println(sek.regnOm2(tall));
					
				} else {
					System.out.println("Du har valgt en ugyldig verdi.");
				}	
			}
		}