
	public class Spiller {
	
		private String nick;
		private int sumPoeng;
		private Terning terning;
	
			public Spiller(String nick){
				this.nick= nick;
				sumPoeng=0;
				terning = new Terning();
			}//end konstruktør
		
			public String getNick() {
				return nick;
			}//end getNick
			
			public int getSumPoeng() {
				return sumPoeng;
			} //end getSumPoeng
			
			public int kastTerning(){
				int oyne = terning.kastTerning();
				
				if (oyne > 0 && sumPoeng < Spill.VINNERSUM){
					sumPoeng += oyne;
				} else if (oyne > 1 && sumPoeng > Spill.VINNERSUM){
					sumPoeng -= oyne;
				} else {
					sumPoeng = 0;
				} //end else
				return oyne;
			} // end if
		
			public boolean erFerdig() {
				if (sumPoeng == Spill.VINNERSUM) {
					return true;
				} else {
					return false;
				}
			}
		};
		
		
		
		
		
		
		
		
		
		
		
		
		