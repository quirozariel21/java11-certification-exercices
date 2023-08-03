import java.io.Console;
import java.util.Arrays;

public class ConsoleExample {
	
	public static void main(String[] args) {
		
		Console console = System.console();

		if(null == console) {
			throw new RuntimeException("Console not available");
		}

		String name = console.readLine("Enter your name: ");
		console.writer().format("Hi %s ", name);
		console.writer().println();
		console.format("What is your address: ");
		String address = console.readLine();

		char[] password = console.readPassword("Enter a password btween %d and %d chars: ", 5, 10);
		char[] verify = console.readPassword("Enter a password again: ");

		console.printf("Password: " + (Arrays.equals(password, verify)? "match": "do not match"));	
	}
	
}