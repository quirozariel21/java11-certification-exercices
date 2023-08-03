public class NestedInitialization {
	
	public class A {

	}

	public static class B {

	}

	public void useClasses() {
		// All of these are valid 
		new NestedInitialization().new A(); // (1)
		new NestedInitialization.B(); // (2)
		new A(); // (3)
		new NestedInitialization.A(); // (4)
		// Option (1) and (4) are the same
	}
}