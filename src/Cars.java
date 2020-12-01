import java.util.ArrayList;

public class Cars {

	public static void main(String[] args) {
		String[] cars = new String[4];
		cars[0] = "Nissan Altima 2018";
		cars[1] = "Corvette Any";
		cars[2] = "Dodge Hellcat";
		cars[3] = "Bugatti";
		
		for(String car: cars) {
			System.out.println(car);
		}
		
		// Creating a temp array that is larger than the original
		String[] temp = new String[cars.length+2];
		
		// Copy original array to the temp
		for(int i = 0; i < cars.length; i++) {
			temp[i] = cars[i];
		}
		
		// Output content of temp
		/*for(String tempCar: temp) {
			System.out.println(tempCar);
		}*/
		
		// Set cars to the extended temp
		cars = temp;
		cars[4] = "Camaro";
		cars[5] = "Ram 2500";
		

		System.out.println("Updated cars:");
		for(String car: cars) {
			System.out.println(car);
		}
		
		// ARRAYLIST
		// Initialize arraylist
		ArrayList<String> cars2 = new ArrayList<String>();
		
		// Add some cars
		cars2.add("Nissan Altima 2018");
		cars2.add("Corvette Any");
		cars2.add("Dodge Hellcat");
		cars2.add("Bugatti");
		
		// Print the contents
		System.out.println(cars2);
		
		// Add more cars
		cars2.add("Camaro");
		cars2.add("Ram 2500");
		System.out.println(cars2);
		
		// Get a specific car at an index
		System.out.println("Harrison's Fav:" + cars2.get(2));
		
		// Remove car at index 2
		cars2.remove(2);
		
		System.out.println("David's Fav:" + cars2.get(2));
		System.out.println(cars2);
		
		// Insert at a specific index
		cars2.set(2, "McClaren");
		System.out.println(cars2);
		
		// Size of our cars
		System.out.println("How many cars we got: " + cars2.size());
		
		
		String[] students = new String[3];
		students[0] = "Juan";
		students[1] = "Seannace";
		students[2] = "Jessica";
		
		for(String name : cars2) {
			System.out.println(name);
		}
	}

}
