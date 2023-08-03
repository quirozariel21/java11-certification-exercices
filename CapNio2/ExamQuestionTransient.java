import java.nio.file.Path;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExamQuestionTransient implements Serializable {
	
	private Integer size = 1;
	private transient String name = "Red";

	{
		size = 3;
		name = "Yellow";
	}

	public ExamQuestionTransient() {
		this.size = 2;
		name = "Black";
	}


	public static void main(String args[]) throws Throwable {

		try (var o = new ObjectOutputStream(
			new FileOutputStream("vegetable.txt"))) {
			final var v = new ExamQuestionTransient();
			v.size = 4;
			o.writeObject(v);	
		}

		try (var o = new ObjectInputStream(
			new FileInputStream("vegetable.txt"))) {

				var v = (ExamQuestionTransient) o.readObject();
				System.out.println(v.size + ", " + v.name); // Print 4, null
				//v.name is null because this variable is transient and the class is
				// marked as Serializable

		}
	}
}