import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversiones {
	
	public static void main(String... args) {
		//De lista a Array
		List<String> list = new ArrayList<>();
		list.add("Gael");
		list.add("Julian");

		Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);

		list.clear();
		System.out.println(Arrays.toString(stringArray));
		System.out.println("lista: " + list);

		System.out.println("===>> Listas Finales <<===");
		//Listas finales
		String[] stringArray2 = {"Ariel", "Alina"};
		List<String> list1 = Arrays.asList(stringArray2);
		System.out.println("list1: " + list1);
		list1.set(0, "Sambi"); // Si se puede modificar la lista pero tambien se modifica automaticamente el array
		//list1.add("Chi"); // Error al compilar UnsorpportedOperationException
		//list1.clear(); // Error al compilar UnsorpportedOperationException
		System.out.println(Arrays.toString(stringArray2));



		List<String> list2 = List.of("one", "two");
		//list2.add("Chi"); // Error al compilar UnsorpportedOperationException
		//list2.set(1, "Chi"); // Error al compilar UnsorpportedOperationException
		//list2.remove(1); // Error al compilar UnsorpportedOperationException
	}
}