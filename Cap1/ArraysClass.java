public class ArraysClass {
	
	public static void main(String args[]) {
		int a = 1;
		//All elements of an array of primitices are automatically initialized by default values, 
		// which is 0 for numeric types and false for boolean.
		int[] ia = new int[10];
		int b = ia[a]; //It is 0
		int c = b + a;
		System.out.println(b = c); // Should print 1
	}
}