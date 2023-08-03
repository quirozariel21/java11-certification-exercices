public class ForWithoutInit {

	/*
		Optional parts of a for statement; initialization block, termination condition and update clause are optional.
		But you must specify that you aren't including a section by just including a semicolon.
	*/
	public static void main(String[] args) {

		// EXAMPLE 1
		/*
		You can define multiple statement in the update clausule, including calls to other methods. The only imit is that these
		statements will execute in the order in wich they appear, at the end of all the statememts defined in the for block.
		*/

		String line = "ab";
		for ( int j = 0; j < line.length(); ++j, printMethod()) {
			System.out.println(line.charAt(j));
		}

		System.out.println("");
		// EXAMPLE 2
		int i = 0;
		for(; i<2; i=i+5) {
			if(i<5) continue;
			System.out.println(i);
		}
		System.out.println(i);

		/*
		int a = 10;
		for(a < 5; ++a) {
								WON'T COMPILE
		}
		*/
	}

	public static void printMethod() {
		System.out.println("Hello");
	}
}