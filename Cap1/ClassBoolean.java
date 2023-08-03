public class ClassBoolean {
	static boolean a; // by default is false
	static boolean b; // by default is false
	static boolean c; // by default is false

	public static void main(String... args) {
		System.out.println("[Default value] a = " + a);
		//Now the left hand expression a=true evaluates to true; Since || is defined to use conditional evaluation, its right-hand size is not evaluated. 
		//variable x is assigned true, a becomes true, and b and c where never assigned to, so they are left with their initial false values.
		// resume the operator || is a shortcout and for that reason the right-hand is not evaluated. 
		boolean bool = (a=true) || (b=true) && (c=true);
		System.out.println(a + ", " + b + ", " + c);	// print= true, false, false	
		System.out.println(bool); // print= true


	}
}