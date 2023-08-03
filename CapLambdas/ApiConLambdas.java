import java.util.List;
import java.util.ArrayList;

/*
	Those methods apply to Collections.
*/
public class ApiConLambdas {
	
	public static void main(String... args){

		List<String> pets = new ArrayList<>();
		pets.add("perro");
		pets.add("gato");
		pets.add("gallina");
		pets.add("peces");

		//System.out.println("===>> RemoveIf <<===");	
		//pets.removeIf( p -> p.startsWith("g"));
		//System.out.println(pets);

		/*
		System.out.println("===>> Sort <<===");	
		pets.sort( (p1, p2) -> p1.compareTo(p2)); //Sort asc
		System.out.println(pets);
		*/

		System.out.println("===>> ForEach <<===");	
		pets.forEach(p -> System.out.println("Pet: " + p));
	}
}