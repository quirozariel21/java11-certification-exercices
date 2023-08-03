public interface Swimming {
	String DEFAULT = "Diving";

	abstract int breath();

	private static void stroke() {
		if(breath() == 1) { // Error in this line because 
			// non-static method cannot be referenced from static context
			System.out.println("Go!");
		} else {
			System.out.println(dive());
		}
	}

	static String dive() {
		return DEFAULT;
	}
}