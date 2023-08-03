import java.util.LinkedList;

public class DequePushClass {
	
	public static void main(String... args) {
		var x = new LinkedList<Integer>();
		// It is a stack FIFO
		x.offer(18); // offer inserts an element at the end of the list
		x.offer(5);
		x.push(13); // push inserts an element at the first of the list
		System.out.println(x.poll() + " " + x.poll()); // print 13 18

	}
}