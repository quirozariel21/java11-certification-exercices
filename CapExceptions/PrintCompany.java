import java.io.Closeable;

public class PrintCompany {
	
	class Printer implements Closeable {

		public void print() {
			System.out.println("This just in!");
		}

		public void close() {}
	}

	public void printHeadlines() {
		// Instead of curly braces {}, should be parentheses()
		// because it is a try-with-resources statement
		//try (Printer p = new Printer()) { // COMPILE
		try {Printer p = new Printer()} { // DOES NO COMPILE
			p.print();
		}
	}

	public static void main(String... args) {
		new PrintCompany().printHeadlines();
	}
}