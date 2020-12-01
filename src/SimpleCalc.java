// Simple Calculator
// By: Dr. Mondesire
// COP1800 - Fall 2020

/**
 * Simple calculator that does square and x^y.
 * @author Dr. Mondesire
 *
 */
public class SimpleCalc {

	private int x = 0;
	private int y = 0;
	
	/**
	 * Default Constructor
	 */
	public SimpleCalc() {
		x = -1;
		y = -1;
	}
	
	/**
	 * Constructor that updates x and y
	 * @param x First number
	 * @param y Second number
	 */
	public SimpleCalc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Getter for x.
	 * @return Returns the value of x.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Getter for y.
	 * @return Returns the value of y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Setter for x.
	 * @param x Updates x to this value.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Setter for y.
	 * @param y Updates y to this value.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Returns x squared.
	 * @param x The value to square.
	 * @return x squared.
	 */
	public int square(int x) {
		return x*x;
	}
	
	/**
	 * Returns x^y
	 * @param x Value to raise to y.
	 * @param y Raise x by this value.
	 * @return x^y.
	 */
	public double pow(int x , int y) {
		return Math.pow(x, y);
	}
	
	public double pow2() {
		return Math.pow(x, y);
	}
}
