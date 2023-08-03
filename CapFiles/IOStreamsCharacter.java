import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamsCharacter {

	public static void main(String... args) throws IOException {
		var f1 = new File("example.txt");
		var f2 = new File("exampleCharacterStream.txt");
		copyFile(f1, f2);
	}

	public static void copyFile(File src, File dest) throws IOException {
		try(var reader = new FileReader(src); 
			var writer = new FileWriter(dest)) {
			int b;
			while((b=reader.read()) != -1) {
				//System.out.println(b);
				writer.write(b);
			}
		}
	}
}