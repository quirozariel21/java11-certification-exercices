import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.io.IOException;

public class PathPrintFile {

	public static void main(String... args) throws IOException {

		var path = Path.of("breakfast.menu");
		Files.readAllLines(path).stream()
		.filter(s -> s.contains("eggs"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
}