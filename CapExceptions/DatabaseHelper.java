import java.io.*;
import java.sql.*;

public class DatabaseHelper {

    /*
    	The closeable interface defines a close() method that throws
    	IOException. The overriden implementatation of this class, which
    	implements Closeable, declares a SQLException
    */
	static class MyDatabase implements Closeable {
		public void close() throws SQLException { // It won't compile
			System.out.print("2");
		}
	}

	public void write(String data) {}

	public String read() { return null; }


	public static void main(String... files) throws Exception {
		try(DatabaseHelper myD = new DatabaseHelper()) {
			//TODO: Decide what to read/write
		} finally {
			System.out.print("1");	
		}
	}
}