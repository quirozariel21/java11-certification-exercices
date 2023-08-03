import java.util.Arrays;

public class CompareMethod {
	
	public static void main(String... args){
		var ints = new int[] {10, 8, 1, 7};
		var others = new int[] {10, 8, 1, 8};

		//This method compares two arrays lexicographically(Dictionary order)
		// it returns 0 is the array is equal to the other array
		// It returns a value less than 0 is returned if the array is lexicographically less than the other array in
		// It returns a value greater than 0 if the array is lexicographically greater than the other array(more characters)
		System.out.println(Arrays.compare(ints, others)); // print -1 because 7 is less than 8
		
	}
}