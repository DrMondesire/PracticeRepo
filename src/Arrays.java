
public class Arrays {

	public static void main(String[] args) {
		// Ex: Create an array odds and fill it with the first 10 odd numbers
		/*double[] odds = new double[20];
		for(int i = 1; i < odds.length; i += 2) {
			odds[i] = i;
		}
		
		for(int i = 1; i < odds.length; i += 2) {
			System.out.println(odds[i]);
		}*/
		
		/*int[] odds = new int[10];
		for(int i = 0; i < odds.length; i++) {
			odds[i] = 1 + (i * 2);
			System.out.println(odds[i]);
		}*/
		
		final int NUM_OF_ODDS = 10;
		int[] odds = new int[NUM_OF_ODDS];
		int oddLength = 0;
		for(int i = 1; i < odds.length*2; i++){
		  if(i % 2 == 1){
		    odds[oddLength] = i;
		    oddLength++;    
		  }  
		}

		for(int i = 0; i < odds.length; i++){
		  System.out.println(odds[i]);
		}
	}

	
}
