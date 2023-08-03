public class ParkRanger {

	int birds = 10;

	public static void main(String[] args) {
		var trees = 5;
		System.out.println(trees + birds); // DOES NOT COMPILE 
		// Because birds is an instance variable and a static method
		//  cannot access to instance variables.
	}
}