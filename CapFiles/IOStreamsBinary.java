import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamsBinary {

	public static void main(String... args) throws IOException {
		var f1 = new File("example.txt");
		var f2 = new File("examplebinaryStream.txt");
		copyFile(f1, f2);
	}

	public static void copyFile(File src, File dest) throws IOException {
		try(var in= new FileInputStream(src); var out = new FileOutputStream(dest)) {
			int b;
			while((b=in.read()) != -1) {
				out.write(b);
			}
		}
	}
}