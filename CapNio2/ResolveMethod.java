import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveMethod {

	public static void main(String... args) {


		String absolutePath = "/home/alina/Desktop/JAVA_11_Certification/../fish";
		String relativePath = "shark";
		
		Path p1 = Path.of(absolutePath);
		Path p2 = Path.of(relativePath);

		Path res = p1.resolve(p2);

		System.out.println("1. Resolve: " + res); //resolve method does not clean symbolic path
		System.out.println("================================= ");

		String absolutePath1 = "/home/alina/Desktop/JAVA_11_Certification";
		String absolutePath2 = "/opt/eclipse";
		
		Path pa1 = Path.of(absolutePath1);
		Path pa2 = Path.of(absolutePath2);
		res = pa1.resolve(pa2);
		System.out.println("2. Resolve: " + res); // you cannot combine two albsolute path using resolve()
		
		System.out.println("================================= ");
		System.out.println(p1.relativize(pa2)); // ../../../../opt/eclipse

		System.out.println("================================= ");
		System.out.println("3. Resolve:  " + p2.relativize(Paths.get("wal-mart/homeofice")));

		System.out.println("\n================================= ");
		Path pp1 = Path.of("./found/../keys");
		Path pp2 = Path.of("/lost/blue.txt");
		res = pp1.resolve(pp2);
		System.out.println("4. Resolve: " + res); // how pp2 is an absolute path then the result always is /lost/blue.txt
	}
	
}