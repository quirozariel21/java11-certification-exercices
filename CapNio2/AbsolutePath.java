import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsolutePath {

	public static void main(String... args) {

		
		checkAbsolutePath(Path.of("fish/shark/example.txt"));
		
	}

	public static void checkAbsolutePath(Path path) {
		
		System.out.println("Path is Absolute? " + path.isAbsolute());
		System.out.println("Aboslute path: " + path.toAbsolutePath());
	}
	
}