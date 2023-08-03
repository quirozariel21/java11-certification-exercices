import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFiles {

	public static void main(String... args) throws IOException {

		FileInputStream f1 = new FileInputStream("example.txt");
		FileOutputStream f2 = new FileOutputStream("example2.txt");

		copystream(f1, f2);
	}

	public static void copystream(InputStream in, OutputStream out) throws IOException {
		int b;
		while((b=in.read())!=-1) {
			out.write(b);	
		}	
	}


}