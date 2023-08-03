/**
 * 
 * Characteristics:
 * 	1. Static type definido como miembro.
 *  2. No requiere una referencia de la "Enclosing" para instanciarse pero tampoco podra acceder a las
 * 		variables o metodos de instancia de "Enclosing", a menos que se use una referencia explicita a la misma.
 * 	3. La clase enclosing puede acceder a los campos y metodos de la clase Nested.
 * 	4. Para importarlo:
 * 		import bird.Toucan.Beak;
 * 		import static bird.Toucan.Beak;
 * 
 * */

public class StaticNestedClassExercise1 {
	enum Baby { EGG }

	static class Chick {
		enum Baby { EGG }	
	}

	public static void main(String... args) {
		boolean match = false;
		Baby egg = Baby.EGG;
		switch (egg) {
			case EGG:
				match = true;
		}

		Chick nested = new Chick();
		System.out.println(nested);
	}
}