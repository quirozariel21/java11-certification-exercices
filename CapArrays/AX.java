public class AX {
	static int[] x = new int[0]; // Cannot initializer with 0

	static {
		x[0] = 10; //It will throw ExceptionInitializeError at runtime
	}	

	public static void main(String... args) {
		var ax = new AX();
	}
}