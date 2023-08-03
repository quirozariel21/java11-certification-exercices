import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparable {
	
	private int id;
	private String name;

	public StudentComparable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "id= "+ this.id + " name= " + this.name;
	}

	public static void main(String... args) {

		var e1 = new StudentComparable(10, "Gael");
		var e2 = new StudentComparable(3, "Alina");
		var e3 = new StudentComparable(5, "Julian");

		List<StudentComparable> students = Arrays.asList(e1, e2, e3);
		System.out.println("Original: \t" + students);

		//Option 1. Creating a nested class
		/*
		Comparator<StudentComparable> byId = new 
		Comparator<StudentComparable>() {

			public int compare(StudentComparable e1, StudentComparable e2) {
				return e1.id - e2.id;
			}
		};
		*/

		//Option 2. Using methods of the class Comparator
		Comparator<StudentComparable> byId = Comparator.comparing( e -> e.id); 
		Comparator<StudentComparable> byIdThenName = Comparator.comparing(StudentComparable::getId).thenComparing(StudentComparable::getName); 
		//Comparator<StudentComparable> byId = Comparator.reverseOrder(); // To work you must implement Comparable 



		//Collections.sort(students, byId);
		Collections.sort(students, byIdThenName);
		System.out.println("OrderById: \t" + students);



	}
}