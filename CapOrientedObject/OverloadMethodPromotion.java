public class OverloadMethodPromotion {
	
	public static void printSum(double a, double b) {
		System.out.println("In double "+(a+b));
	}

	public static void printSum(float a, float b) {
		System.out.println("In float "+(a+b));
	}

	public static void printSum(int a, int b) {
		System.out.println("In int "+(a+b));
	}

	public static void main(String args[]) {
		printSum(1.0, 2.0);
		//Print In double 3.0 because 1.0 and 2.0
		// are double, wich are exact match to
		// double double
	}
}