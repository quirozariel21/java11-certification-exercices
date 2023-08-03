import java.util.*;

public class ArrayListAndSet {

	public static void main(String args[]){

		ArrayList<String> als = new ArrayList<>(List.of("a", "b", "c"));
		Set<String> ss = new HashSet();
		ss.addAll(als);
		als.clear();
		System.out.println(ss.size());

	}
}