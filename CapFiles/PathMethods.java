import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {
	
	public static void main(String... args) {

		Path path = Paths.get("panda/new/my_panda.txt");
		System.out.println("Path is: " + path);
		System.out.println("Path is: " + path.getNameCount());
		System.out.println("0 Path is: " + path.getName(0));
		System.out.println("1 Path is: " + path.getName(1));
		System.out.println("2 Path is: " + path.getName(2));

		System.out.println("\n---- SubPath ----");
		System.out.println("SubPath is: " + path.subpath(0, 3));
		System.out.println("SubPath is: " + path.subpath(1, 2));
		System.out.println("SubPath is: " + path.subpath(1, 3));


		System.out.println("\n---- getFileName, getParent, getRoot ----");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());


		System.out.println(path.isAbsolute());
		System.out.println(path.toAbsolutePath());

		System.out.println("\n---- resolve ----"); // Concatena dos paths pero las dos deben ser relativas o absolutas
		System.out.println(path.resolve("second/third"));

		System.out.println("\n---- relativize ----"); // Ambas deben ser relativas o absolutas, caso contrario exception
		System.out.println(path.relativize(Path.of("new/second_panda.txt")));
		System.out.println("");
	}
}