import static javax.swing.JOptionPane.*;


		public class Spill {
			public final static int VINNERSUM = 100;
			
			private Spiller[] spillere;
			private boolean running;
			private int antRunder;
		
			public Spill(){
				antRunder = 0;
			}//end spill kontruktør
			
			private void init(){
				int antSpillere = 2;
				spillere = new Spiller[antSpillere];
				
				
				spillere[0]= new Spiller("A");
				spillere[1]= new Spiller("B");
				
				System.out.println("Starter spillet, may the odds be ever in your favor...");
				running = true;
			}//end void init
			
			public void run() {
				init();
				do {
					antRunder++;
					kastTerninger();
					if (erFerdig()) {
						finish();
					}
					
				} while (running);
				
			}//end void run
			
			private void kastTerninger() {
				System.out.println("---Runde " + antRunder + " ---");
				for (int i = 0; i < spillere.length; i++) {
					System.out.println(spillere[i].getNick() 
						+ " kaster " + spillere[i].kastTerning() 
							+ " for en total av " + spillere[i].getSumPoeng());
				}
			}
			
			private boolean erFerdig() {
				for(int i = 0; i < spillere.length; i++){
					if (spillere[i].erFerdig()) {
						return true;
					}
				}	
				return false;	
			}
			
			private void finish(){
				Spiller vinner = getVinner();
				System.out.print(vinner.getNick() + " vinner etter " + antRunder + " runder!");
				running = false;
			}
			
			private Spiller getVinner() {
				for (int i=0; i < spillere.length; i++) {
					if (spillere[i].erFerdig()) {
						return spillere[i];
					}
				}
				return null;
			}
			
		}//end class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		