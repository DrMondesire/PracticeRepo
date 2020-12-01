/*
 * Mod2 SalesTax:
 * Calculate sales tax of video games.
 * @author: You
 */
public class SalesTax {

	public static void main(String[] args) {
		// Initializing variables
		double price = 29.75;
		int copies = 3;
		double tax = 0.067;
		double subtotal = copies * price;
		double total = subtotal * (1+tax);
		double outputTax = tax * 100;
		
		
		// Outputting results
		System.out.println("Price: $" + price );
		System.out.println("Copies:" + copies);
		System.out.println("Tax: " + outputTax + "%");
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Total: $" + total);
	}

}
