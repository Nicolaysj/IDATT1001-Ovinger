import javax.swing.JOptionPane;

public class Oving3_2 {
	public static void main (String[] args) {
		//Lager en boolean value satt til true så programmet kan kjøre om og om igjen
		boolean run = true;	
		
		//Lager en while-løkke som gjør at programmet kjører om og om igjen ettersom run=true
		while (run) {
		String tall = JOptionPane.showInputDialog("Hvilket tall vil du sjekke?");
		int n = Integer.parseInt(tall);	
		//Lager en variabel m som er lik valgt tall delt på to
		int m = n/2;
		/*Lager en variabel flag og tildeler verdien 0 (Brukes som en boolean 0=false, 1=true)*/																	
		int flag = 0;																
		//Sjekker om valgt tall er 0 eller
		if(n==0 || n==1)  {										
			System.out.println(n + " er ikke et primtall.");							
		
		} else {
			//Sjekker hver verdi fra 2 til m (n/2)
			for (int i=2; i<=m;i++) {
				//Sjekker om valgt tall kan deles på noen av verdiene i definert over uten å ha en restverdi
				if (n%i==0){
					System.out.println(n + " er ikke et primtall.");
					//Gir flag variabelen verdien 1 ettersom den nå er sann (flag=1, true) (ikke flere ting å sjekke)
					flag=1;
					break;
				}
				//Hvis tallet ikke kan deles på noen av disse verdiene vil det da si at det er et primtall (flag=0, false)
				} if (flag==0) {
					System.out.println(n + " er et primtall."); //kunne brukt else her
				}
			}
		}
	}
}