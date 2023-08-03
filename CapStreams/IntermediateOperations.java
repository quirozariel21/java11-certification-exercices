import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;

public class IntermediateOperations{

	public static void main(String... args){
		var list = List.of(5, 2, 7, 12, 17, 8);

		list.stream()
			.filter(n -> n%2==0)
			.sorted(Comparator.reverseOrder())
			.limit(2)
			.forEach(System.out::println);	


		System.out.println("==>> peek <<==");	
		var infinite = Stream.iterate(1, x -> x+1);

		infinite.filter(x->x%2==1)
		.peek(System.out::println)
		.limit(5)
		.forEach(System.out::println);
	}
	
}