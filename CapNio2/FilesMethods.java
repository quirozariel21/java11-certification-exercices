import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.io.IOException;

public class FilesMethods {

	public static void main(String... args) throws IOException {

		// EXISTS
		var path = Path.of("breakfast.menu"); // It can be a File o directory
		var b1 = Files.exists(path);
		System.out.println("Path " + (b1 ? "Exists" : "MIssing"));

		//CREATE DIRECTORY
		Files.createDirectory(Path.of("./field")); //If directory already exists then throws exception.
		Files.createDirectories(Path.of("./field/pasture/green")); // It created all directories if they don't exist.

		//The lines() method return a stream but the readAllLines method return a List
		Files.lines(Path.of("/hello/test/salad.txt"))
		.filter( s  -> s.contains("carrots"))
		.collect(Collectors.toList())
		.forEach(System.out::println);


		
	}
	
}