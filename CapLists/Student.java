import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 Implementing the class Comparable we have a limit because 
 we are going to order only by one attribute of the class.
*/
public class Student implements Comparable<Student> {
	
	private int id;

	@Override
	public int compareTo(Student student) {
		return this.id - student.id;
	}

	@Override
	public String toString() {
		return "id: " + id; //Order ascendente
	}


	public static void main(String[] args) {
		var a1 = new Student();
		a1.id = 10;
		var a2 = new Student();
		a2.id = 3;

		System.out.println(a1.compareTo(a2));

		List<Student> students = new ArrayList<Student>();
		students.add(a1);
		students.add(a2);
		Collections.sort(students);
		System.out.println(students);
	}
}