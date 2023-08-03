import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapMethods {
	
	public static void main(String... args) {
		Map<String, String> map1 = 
		Map.of("key1", "val1", "key2", "val2");
		System.out.println("Using Map.of: " + map1);

		Map<String, String> map2 = 
		Map.ofEntries(
						Map.entry("key1","val1"),
						Map.entry("key2","val2")
						); 

		System.out.println("Using Map.ofEntries: " + map2);

		Map<String, String> map3 =
		Map.copyOf(map2); 
		System.out.println("Using Map.copOf: " + map3);

		//map2.put("key3", "val3"); //  Don't compile because it is final map
		//System.out.println(map3);

		System.out.println("===>> Map Basic Methods <<===");
		Map<String, String> animals = new HashMap<>();
		animals.put("koala", "bamboo");
		animals.put("lion", "meat");
		animals.put("giraffe", "leaf");
		String food = animals.get("koala");// bamboo
		for(String key: animals.keySet())
			System.out.print(key + ", ");

	    System.out.println("\n===>> TreeMap Methods (Sort)<<===");
	    Map<String, String> animalsTreeMap = new TreeMap<>();
	    animalsTreeMap.put("koala", "bamboo");
		animalsTreeMap.put("lion", "meat");
		animalsTreeMap.put("giraffe", "leaf");
		
		for(String key: animalsTreeMap.keySet())
			System.out.print(key + ", ");

		System.out.println("\n===>> Printing values <<===");
		//The order of the values would correspond t  the order of the keys
		for(String value: animalsTreeMap.values())
			System.out.print(value + ", ");

		System.out.println("\n===>> ForEach and entrySet <<===");
		Map<Integer, Character> characters = new HashMap<>();
		characters.put(1, 'a'); 	
		characters.put(2, 'b'); 	
		characters.put(3, 'c'); 	
		characters.forEach( (k,v) -> System.out.println(v));
		characters.values().forEach(System.out::println);

		System.out.println("\n===>> Merge (Util to update values but applying rules)<<===");

		BiFunction<String, String, String> mapper = 
		(v1, v2) -> v1.length()>v2.length() ? v1: v2;
		Map<String, String> favorties = new HashMap<>();
		favorties.put("cod1", "one"); 	
		favorties.put("cod2", "two"); 	
		favorties.put("cod3", "three"); 	
		System.out.println("Original: " + favorties);
		favorties.merge("cod1", "five", mapper);
		System.out.println("Merge: " + favorties);

		System.out.println("\n===>> 1. Merge (When key does not exist)<<===");
		Map<String, String> products = new HashMap<>();
		products.put("cod1", "television"); 	
		products.put("cod2", "lavadora"); 	
		products.put("cod3", "secadora"); 	
		System.out.println("Original: \t" + products);
		products.merge("cod4", "DVD", mapper); // How cod4 does not exits then put new code
		System.out.println("Merge: \t\t" + products);

		System.out.println("\n===>> 2. Merge (When BiFunction return null)<<===");
		BiFunction<String, String, String> mapper1 = 
		(v1, v2) -> null;
		Map<String, String> productos = new HashMap<>();
		productos.put("cod1", "television"); 	
		productos.put("cod2", "lavadora"); 	
		productos.put("cod3", "secadora"); 	 	
		System.out.println("Original: \t" + productos);
		productos.merge("cod3", "DVD", mapper1); // How function return null then cod3 will be removed.
		System.out.println("Merge: \t\t" + productos);








	}
}