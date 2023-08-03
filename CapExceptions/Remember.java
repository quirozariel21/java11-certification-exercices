
import java.io.*;

public class Remember {
	
	public static void think() throws IOException {

		try {
			throw Exception(); // DOES NO COMPILE because missing the new keyword
			// throw new Exception(); // if the new keyword were added, though, the line
			// would still not compile as the checked exception is not handled or 
			// declared within the think () method
		} catch(RuntimeException r) {}
	}

	public static void main(String... args) // throws Exception add this line to compile this class
	{
		think();
	}
}