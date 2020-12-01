// Simple Main Class
// Dr. Mondesire

/**
 * Main Simple class for calculations.
 * @author smondesire
 *
 */
public class Simple {
	/**
	 * Prompts user for input.
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialization of our SimpleCalc
		SimpleCalc calc = new SimpleCalc();
		System.out.println("Calc x:" + calc.getX());
		System.out.println("Calc y:" + calc.getY());
		
		SimpleCalc calc2 = new SimpleCalc();
		System.out.println("Calc2 x:" + calc2.getX());
		System.out.println("Calc2 y:" + calc2.getY());
		
		int squareResult = calc.square(3);
		System.out.println("3^2 = " + squareResult);
		
		double powResult = calc2.pow(calc2.getX(),  calc2.getY());
		System.out.println("x^y = " + powResult);
		
		System.out.println("Cacl2 x^y = " + calc2.pow2());

		// Default constructor
		SimpleCalc calc3 = new SimpleCalc();
		System.out.println("Calc3 x: " + calc3.getX());
		
		// Constructor that updates x and y
		int userX = 3452345;
		int userY = 234234;
		SimpleCalc calc4 = new SimpleCalc(userX, userY);
		System.out.println("Calc4 x: " + calc4.getX());
		
		// Update calc4's x to be 5
		int updatedX = 234235;
		calc4.setX(updatedX);
		System.out.println("Update Calc4 x: " + calc4.getX());
	}

}
