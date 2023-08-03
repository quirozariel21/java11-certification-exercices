import java.util.stream.Stream;
import java.util.Optional;
import java.util.List;
import java.util.function.Predicate;

public class TerminalOperationsReduce{
	
	public static void main(String[] args){
		Stream<String> infinite = Stream.generate(() -> "Hello");
		List<String> list = List.of("monkey", "gorilla", "bonoboo");

		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> fourElement = Stream.of(3, 5, 6, 7);
		Stream<Integer> empty = Stream.empty();


		System.out.println("===>> Reduce <<===");
		//The firt param of the reduce method is an acumulator and the second one is a Identity
		String value = list.stream().reduce("", (a,b)-> a.concat(b));
		System.out.println(value);

		System.out.println("===>> Sin identity <<===");
		//You can use of this way if you want return an optional
		empty.reduce((a,b)->a*b).ifPresent(System.out::println);
		oneElement.reduce((a,b)->a*b).ifPresent(System.out::println);
		fourElement.reduce((a,b)->a*b).ifPresent(System.out::println);

		System.out.println("===>> Reduce <<===");
		int tamanio = list.stream().reduce(0, (a,b)->a+b.length(), (c,d)->c+d);
		//int tamanio = list.stream().reduce(0, (a,b)->a+b.length()); //Error
		System.out.println(tamanio);
		

	}
}