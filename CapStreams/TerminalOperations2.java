import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.function.Predicate;

public class TerminalOperations2{
	
	public static void main(String[] args){
		Stream<String> infinite = Stream.generate(() -> "Hello");
		List<String> list = List.of("monkey", "gorilla", "bonoboo");

		Predicate<String> pred = x -> x.startsWith("m");

		System.out.println("===>> anyMatch, allMatch, noneMatch <<===");
		
		System.out.println(list.stream().anyMatch(pred));
		System.out.println(list.stream().allMatch(pred));
		System.out.println(list.stream().noneMatch(pred));

		System.out.println("===>> forEach <<===");
		list.stream().forEach(System.out::println);
		

	}
}