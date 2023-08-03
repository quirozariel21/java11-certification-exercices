public class Varsrgs {
	public static void main(String args[]) {
		//System.out.println(average(1, 2, 3, 4)); //Print 10
		//System.out.println(average()); //Print 0
		System.out.println(average(null)); // Compile but it fails in the execution
	}

	public static double average(int... values) {
		double sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}