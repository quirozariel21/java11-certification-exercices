import java.io.*;

public class Vegetable implements Serializable {

	private Integer size = 1;
	private transient String name = "Red";
	{
		size = 3;
		name = "Purple";
	}

	public Vegetable() {
		this.size = 2;
		this.name = "Green";
	}

	public static void main(String... args) throws Throwable {

		try (var o = new ObjectOutputStream(
			new FileOutputStream("breakfast.menu"))) {
			final var v = new Vegetable();
			v.size = 4;
			o.writeObject(v);
		}

		try ( var o = new ObjectInputStream(
			new FileInputStream("breakfast.menu"))) {
			var v = (Vegetable) o .readObject();
			System.out.println(v.size + ", " + v.name);	 //Print 4,null
			// name is null because this property is transient and it is not serializable
		}
	}
	
}