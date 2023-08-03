import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class SkipListSetAndCopyOnWriteExample{
	
	public static void main(String args[]) {
		// Versiones concurrents de TreeSet y TreeMap
		Set<String> pets = new ConcurrentSkipListSet<>(); // mantiene elementos en Orden natural.
		pets.add("rabbit");
		pets.add("dog");
		System.out.println(pets.stream().collect(Collectors.joining(",")));


		System.out.println("--------------------------");
		//Estas classes copian todo el contenido de sus elementos hacia una nueva estructura cada vez que hay 
		// una adicion, modificacion o eliminacion.
		List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
		for(var n: favNumbers) {
			System.out.print(n + " ");
			favNumbers.add(9);
		}
		System.out.println();
		System.out.println("Size: " + favNumbers.size());
		System.out.println(favNumbers);
	}
}