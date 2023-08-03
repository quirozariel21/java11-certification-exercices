import java.util.Queue;
import java.util.LinkedList;

public class QueueMethods {
	
	public static void main(String... args) {

		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue);
		//System.out.println(queue.element()); // This method throws an exception because there are no elements
		System.out.println(queue.peek());

		System.out.println("\n===>> Adding <<===");
		System.out.println(queue.offer(100));
		System.out.println(queue.offer(4));
		System.out.println(queue.offer(40));
		System.out.println(queue.add(50));
		System.out.println(queue.add(500));

		System.out.println(queue);

		System.out.println("\n===>> Reading <<===");
		System.out.println(queue.element());
		System.out.println(queue.peek());

		System.out.println("\n===>> Removing <<===");
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());


		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll()); //There is no element then returns null
		System.out.println(queue);

		System.out.println(queue.remove()); //If there is no elments then it returns java.util.NoSuchElementException

	}
}