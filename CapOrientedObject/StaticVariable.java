public class StaticVariable {
	static String url = "jdbc://derby://localhost:1527//mydb";

	static StaticVariable getDatabase() {
		System.out.println("Getting DB");
		return null;
	}

	public static void main(String... args) {
		// This question demostrates that a null reference
		// may be used to access a class (static)
		// variable wihout causing an exception
		System.out.println(getDatabase().url);
		//Print Getting DB and  "jdbc://derby://localhost:1527//mydb"
	}
}