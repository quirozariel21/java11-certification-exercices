import java.util.*;

public class Helper {
	
	public void helpPeople(Queue people, Queue helped) {
		do {
			Person p = (Person) people.poll(); // poll method is to get a element
			System.out.println("Helped : " + p + " ");
			helped.offer(p.getName());

		} while(!people.isEmpty());
	}


	public static void main(String args[]){
		Queue<Person> q = new LinkedList<Person>();
		q.offer(new Person("Pope")); //Offer method is to add elements
		q.offer(new Person("John"));

		Queue<Person> helpedQ = new LinkedList<Person>();
		
		Helper h = new Helper();
		h.helpPeople(q, helpedQ);

	}	
}

class Person {
	
	private String name;
	public Person(String name) { this.name = name; }
	public String getName() { return this.name; }
	public void setName(String name){ this.name = name; }

	public String toString() { return this.name; }

}

