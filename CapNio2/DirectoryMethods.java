import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.files.BasicFileAttributes;
import java.util.stream.Collectors;
import java.io.IOException;

public class DirectoryMethods {

	public static void main(String... args) throws IOException {


		//COPY
		var file = Paths.get("food.txt"); // The file must exists
		var directory = Paths.get("./enclosure/food.txt"); // The directory must exists
		//var directory = Paths.get("/enclosure").resolve(file.getFileName()); It is the same of up code
		//Files.copy(file, directory);

		//Move or rename
		//Files.move(Path.of("/home/alina/zoo"), Path.of("/home/alina/zoo-new")); //It rename zoo to zoo-new
		//Files.move(Path.of("/home/alina/zoo.txt"), Path.of("/opt/test/zoo2.txt")); //Move zoo.txt and rename it.
		//Files.move(Path.of("/home/alina/zoo.txt"), Path.of("/opt/test/zoo2.txt"), REPlACE_EXISTING);

		System.out.println("Size ::: " + Files.size(Paths.get("./enclosure/food.txt"))); // Only it is useful for files and not directories

		var path = Paths.get("./enclosure/food.txt");

		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

		System.out.println("Is a directory? " + data.isDirectory());
		System.out.println("Is a regular file? " + data.isRegularFile());
		System.out.println("Is a symbolic link? " + data.isSymbolicLink());
		System.out.println("Size (in bytes): " + data.size());
		System.out.println("Last modified: " + data.lastModifiedTime());
		
	}
	
}