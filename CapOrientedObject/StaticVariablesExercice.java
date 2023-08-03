public class StaticVariablesExercice {

	int value = 1;
	StaticVariablesExercice link;

	public StaticVariablesExercice(int val) {
		this.value = val;
	}

	public static StaticVariablesExercice setId(final StaticVariablesExercice x,
		final StaticVariablesExercice y) {
		System.out.println("X " + x);
		System.out.println("Y " + y);
		System.out.println("Y.link " + y.link);
		System.out.println("X.link " + x.link);
		//x.link is null and this is the reason for the ERROR in the execution
		x.link = y.link;
		return x;
	}

	public static void main(String... args) {
		final var a = new StaticVariablesExercice(5);
		var b = new StaticVariablesExercice(10);

		a.link = b;
		b.link = setId(a, b);
		System.out.println(a.link.value + " " + b.link.value);
		//Throw NullPointerException  in the method setId
	}

}