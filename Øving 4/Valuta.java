public class Valuta {
	
	private String name;
	private double kurs;
	private String besk;
	
	public Valuta(String t, double y, String u){
		this.name=t;
		this.kurs=y;
		this.besk=u;
		};

		String regnOm(double tall){	
			return (tall + " norske kroner" + " tilsvarer " + tall*this.kurs + this.besk);
		} 
				
		String regnOm2(double tall){
			return (tall + this.besk + " tilsvarer " + tall/this.kurs + " norske kroner");
		}		
	}


