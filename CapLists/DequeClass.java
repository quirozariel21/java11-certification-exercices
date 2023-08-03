import java.util.*;

public class DequeClass {
	
	public static void main(String args[]){
		//it is a stack, last in first out (LIFO)
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);
		d.push(2);
		d.push(3);
		System.out.println(d.pollFirst()); 	// print 3
		System.out.println(d.poll()); 		// print 2
		System.out.println(d.pollLast());	// print 1
	}
}