import java.nio.file.Path;
import java.nio.file.Paths;

public class AccesingPath {

	public static void main(String... args) {

		printPathInformation(Path.of("fish"));
		System.out.println("---------------------");
		printPathInformation(Path.of("fish/shark/example.txt"));
		System.out.println("---------------------");
		printPathInformation(Path.of("./shark/../example.txt"));
		System.out.println("---------------------");
		printPathInformation(Path.of("./crossfit/../wod.txt")); // It is nocessary the path exists
		System.out.println("---------------------");
		printPathInformation(Path.of("/cross3640/altitude/games.txt"));
	}

	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while((currentParent = currentParent.getParent()) != null){
			System.out.println("Current parent is: " + currentParent);	
		}
	}
	
}