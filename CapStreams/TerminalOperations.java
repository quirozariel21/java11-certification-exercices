import java.util.stream.Stream;
import java.util.Optional;

public class TerminalOperations{
	
	public static void main(String[] args){
		Stream<String> infinite = Stream.generate(() -> "Hello");

		System.out.println("===>> Count <<===");
		Stream<String> s = Stream.of("monkey", "gorilla", "bonoboo");
		System.out.println(s.count());

		System.out.println("===>> Min <<===");
		s = Stream.of("monkey", "gorilla", "bonoboo");
		Optional<String> min = s.min((s1, s2)-> s1.compareTo(s2));
		min.ifPresent(System.out::println);


		System.out.println("===>> FindAny, FindFirst <<===");
		s = Stream.of("monkey", "gorilla", "bonoboo");
		s.findAny().ifPresent(System.out::println);

		infinite.findAny().ifPresent(System.out::println);
		

	}
}