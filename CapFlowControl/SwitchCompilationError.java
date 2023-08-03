public class SwitchCompilationError {
	public static void main(String args[]) {
		int num = 20;
		final int num2;
		num2 = 20;

		//The case labels require compile-time constant values, and the variable num2 does not qualify as such.
		// Although the variable num2 is defined as a final variable
		//it is not assigned a value with its declaration. The code
		// assigns a literal value 20 to this variable after its decalration, but it is not considered to be a compile-time
		// constant by the Java compiler. Therefore a correct statement would be:
		// final int num2 = 10 it will compile 
		switch(num) {
			default: System.out.println("default");
			case num2: System.out.println(4);
			break;
		}
	}
}