import java.util.ArrayList;

public class RemoveArrayList {
	
	public static void main(String... args) {
		ArrayList<Integer> enteros = new ArrayList<>();

		enteros.add(Integer.valueOf(2));
		enteros.add(Integer.valueOf(0));
		enteros.add(Integer.valueOf(4));

		System.out.println(enteros);

		System.out.println("==> Removing <==");
		System.out.println("Remove pos 0 = " + enteros.remove(0));
		System.out.println("Remove value 4 = " + enteros.remove(Integer.valueOf(4)));
		System.out.println(enteros);
	}
}