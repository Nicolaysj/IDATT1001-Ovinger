
	import java.util.Random;

		public class Terning {
			private Random r;
			
			public Terning() {
				r = new Random();
			}
			
			public int kastTerning(){
				return (r.nextInt(6)+1);
			}
	
	
}//end class