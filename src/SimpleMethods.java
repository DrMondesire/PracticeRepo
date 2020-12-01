
public class SimpleMethods {

	public static void main(String[] args) {
		String str = new String("Hi Universe!"); 
		printValue(addExcite(str));
		
		/*String strWithBang = addExcite(str);
		printValue(strWithBang);*/
	}

	/**
	 * Prints a string to console.
	 * @param str The string to print.
	 */
	public static void printValue(String str) {
		System.out.println(str);
	}
	
	/**
	 * Adding an exclamation mark to a string
	 * @param str String to add the exclamation mark to.
	 * @return Return a string with an added exclamation mark.
	 */
	public static String addExcite(String str) {
		String strExcite = new String(str + "!");
		return strExcite;
	}
}
