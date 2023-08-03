import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativeMethod {

	public static void main(String... args) {

		//both relative paths
		Path path1 = Path.of("file.txt");
		Path path2 = Path.of("fish/ispi.txt");
		

		System.out.println(path1.relativize(path2)); // ../fish/ispi.txt
		System.out.println(path2.relativize(path1)); // ../../file.txt
		System.out.println("================================= ");


		// boths absolue paths
		Path path3 = Paths.get("/home/alina/Desktop/JAVA_11_Certification");
		Path path4 = Paths.get("/opt/eclipse");
		
		System.out.println(path3.relativize(path4)); // ../../../../opt/eclipse
		System.out.println(path4.relativize(path3)); // ../../home/alina/Desktop/JAVA_11_Certification

		System.out.println("================================= ");

		//Cannot combine a relative path and an absolute path		
		System.out.println(path1.relativize(path4)); // java.lang.IllegalArgumentException: 'other' is different type of Path
	}
	
}