import java.util.Scanner;

/*
 * Dr. Mondesire
 * Fall 2020
 * Quiz: Animal Card
 */

/**
 * Object for storing animal bio.
 * @author smondesire
 *
 */
public class AnimalString {

	/**
	 * Main entry point. Prompt user for animal bio.
	 */
	final int DOG_YEARS = 7;
	public static void main(String[] args) {
		// Declared and initialized
		String name = new String("");
		int age = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for in answers:
		System.out.print("What is the animal's name: ");
		name = input.next();
		System.out.println("Name: " + name);
		
		// Age
		System.out.print("Age: ");
		age = input.nextInt();
		System.out.println("Age: " + age);
	}

}
