
/**
 * Loops through number to make even or odd determinations.
 * @author smondesire
 *
 */
public class Loops {
	/**
	 * Outputs a range of number to be even or odd.
	 * @param args No arguments passed.
	 */
	public static void main(String[] args) {
		// Display if the number range is even or odd.
		evenOrOdd(0, 10);	
	}
	
	/**
	 * Print each value of a number range to be even or oddd.
	 * @param start The starting number.
	 * @param end The ending number.
	 */
	public static void evenOrOdd(int start, int end) {
		for(int i = start; i <= end; i++) {
			if(isEven(i)) {
				System.out.println(i + " - even");
			}
			else {
				System.out.println(i + " - odd");
			}
		}
	}
	
	/**
	 * Returns true if num is even; False otherwise.
	 * @param num Number to check if it is even.
	 */
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
