/*
 * Name: Dr. Mondesire
 * Title: Logical Statement Exercises
 * Course: COP1800 - Intro to Java
 */

import java.util.Scanner;

/**
 * If-statement exercises.
 * @author Dr. Mondesire
 *
 */
public class LogicalStatements {
	// Total amount of scores
	final static double NUM_OF_SCORES = 3;
	
	/**
	 * Main entry point for the logical exercises.
	 * @param args No parameters are accepted.
	 */
	public static void main(String[] args) {
		// Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);
	      
		// Declare and initialize credit and scores
	    int credits = 0;
	    double score1 = -1;
		double score2 = -1;
		double score3 = -1;
		double avgScore = -1;		
				
		// Get the user's scores
		System.out.print("Earned credits: ");
		credits = keyboard.nextInt();
		
		System.out.print("Enter score 1 (0-100): ");
		score1 = keyboard.nextDouble();
		
		System.out.print("Enter score 2 (0-100): ");
		score2 = keyboard.nextDouble();
		
		System.out.print("Enter score 3 (0-100): ");
		score3 = keyboard.nextDouble();
		
		// Close the scanner
		keyboard.close();
		
		// Calculate the average
		avgScore = (score1 + score2 + score3)/NUM_OF_SCORES;
		
		// Display outputs
		System.out.println("----- Summary -----");
		System.out.println("Earned credits: " + credits);
		System.out.println("Score 1: " + score1);
		System.out.println("Score 2: " + score2);
		System.out.println("Score 3: " + score3);
		System.out.println("Average score: " + avgScore);
		

		// IF STATEMENT CONDITIONS:
		// Case 1: Display "Error: Invalid Input!" if any score is not within [0-100] or credits is negative, then exit
		if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100 || score3 < 0 || score3 > 100 || credits < 0) {
			System.out.println("Error: Invalid Input!");
			System.exit(0);
		}
		
		// Case 2: Display the class level: First Year, Sophomore, Junior, Senior
		
		// Case 3: Display "Final grade: A" if the average score is above 90.
		if(avgScore > 90) {
			System.out.println("Final grade: A");
		}
		else if(avgScore > 80) {
			System.out.println("Final grade: B");
		}
		else if(avgScore > 70) {
			System.out.println("Final grade: C");
		}
		else if(avgScore > 60) {
			System.out.println("Final grade: D");
		}
		else {
			System.out.println("Final grade: F");
		}
		// Case 4: Display "Increasing grades" if Score 1 is greater than Score 2 and Score 2 is greater than Score 3
		
		// Case 5: Display which grade is the lowest and which is the highest:
		// "Lowest: Score 1"
		// "Highest: Score 3"
		score1 = 2;
		score2 = 2;
		score3 = 3;
		if(score1 < score2 && score1 < score3) {
			System.out.println("Lowest: Score 1");
		}
		else if(score2 < score1 && score2 < score3) {
			System.out.println("Lowest: Score 2");
		}
		else {
			System.out.println("Lowest: Score 3");
		}
		// Case 6: Display the letter grade for each score. Ex. 85 -> "Score 2: B"
		if (score1 > 90) {
			System.out.println("Score 1: A");
		}
		else if (score1 > 80) {
			System.out.println("Score 1: B");
		}
		// Case 7: Using nested If, if the average score is above 75, output the letter grade for each score, otherwise "Low score!"
		
		// Case 8: Using if-ifelse-else: Calculate credit points: credits multiplied by the total score
		// Then display the year and if the student is in good standing or not (average score above 70): 
		// "First Year: Good Standing"

		
		// Terminate the program
		System.exit(0);
	}

}
