import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamsBufferedCharacter {

	public static void main(String... args) throws IOException {
		var f1 = new File("example.txt");
		var f2 = new File("exampleCharacterStreamBuffered.txt");
		copyFile(f1, f2);
	}

	public static void copyFile(File src, File dest) throws IOException {
		try(var reader = new BufferedReader( new FileReader(src)); 
			var writer = new BufferedWriter( new FileWriter(dest))) {
			String b; //return a String and not a int
			while((b=reader.readLine()) != null) {
				//System.out.println(b);
				writer.write(b);
				writer.newLine();
			}
		}
	}
}