import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;

public class Grouping {

	public static void main(String... args){
		System.out.println("--- Grouping ---");
		var pets = Stream.of("loro", "gato", "perro");

		Map<Integer, List<String>> map = pets.collect(Collectors.groupingBy(String::length));
		System.out.println(map);


		System.out.println("==>> partitioning <<==");	
		var pets2 = Stream.of("loro", "gato", "perro");
		Map<Boolean, List<String>> map2 = pets2.collect(Collectors.partitioningBy(s->s.length()<=5));
		System.out.println(map2);
	}
	
}