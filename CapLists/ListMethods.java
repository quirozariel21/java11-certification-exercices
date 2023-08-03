import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListMethods {
	
	public static void main(String... args) {
		

		List<Integer> numbers = Arrays.asList(1, 2, 3);
		System.out.println("numbers: " + numbers);
		numbers.replaceAll(x -> x*2);
		System.out.println("numbers: " + numbers);
		
	}
}