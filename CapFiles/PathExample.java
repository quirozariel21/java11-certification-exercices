import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	public static void main(String... args) {

		Path path = Path.of("pandas/my_panda.txt"); // Relative path
		Path path2 = Path.of("/home/alina/Desktop/JAVA_11_Certification/CapFiles/pathExample.txt"); //Absolute path

		Path path3 = Path.of("pandas", "my_panda.txt");
		Path path4 = Paths.get("pandas/my_panda.txt");	
	}
	
}