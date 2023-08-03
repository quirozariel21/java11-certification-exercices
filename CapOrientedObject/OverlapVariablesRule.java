public class OverlapVariablesRule {
	static String name = "Gael";

	public static void main(String... args) {
		String name = "Chi";

		for(int i=0; i< 10; i++) {
			String name = "Jose";	//The rule is that the variable created in the method
			                        // cannot be override for a for-loop and block variable 
			                        // COMPILATION ERROR
			System.out.println(name);
		}
	}


}