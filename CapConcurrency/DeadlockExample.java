import java.util.concurrent.*;

public class DeadlockExample {
	
	public static void main(String... args) {

		// Create participants and resources
		Fox foxy = new Fox();
		Fox tails = new Fox();
		Food food = new Food();
		Water water = new Water();
		// Process data
		ExecutorService service = null;
		try {
			service = Executors.newScheduledThreadPool(10);
			service.submit(() -> foxy.eatAndDrink(food, water));
			service.submit(() -> tails.drinkAndEat(food, water));
		} finally {
			if(service != null) 
				service.shutdown();
		}

		/*
		In this example, Foxy obtains the food and then moves to the other side of
		the environment to obtain the water. Unfortunately, Tails already drank
		the water and is waiting for the food to become available. The result is that
		our program outputs the following, and it hangs indefinitely:
		Got Food!
		Got Water!
		This example is considered a deadlock because both participants are
		permanently blocked, waiting on resources that will never become
		available.

How do you fix a deadlock once it has occurred? The answer is that
you can't in most situations. On the other hand, there are numerous
strategies to help prevent deadlocks from ever happening in the first
place. One common strategy to avoid deadlocks is for all threads to
order their resource requests
		
		*/

	}
}

class Food {}
class Water {}
class Fox {
	public void eatAndDrink(Food food, Water water) {
		synchronized(food) {
			System.out.println("Got Food!");
			move();
			synchronized(water) {
				System.out.println("Got Water!");
			}
		}
	}

	public void drinkAndEat(Food food, Water water) {
		synchronized(water) {
			System.out.println("Got Water!");
			move();
			synchronized(food) {
				System.out.println("Got Food!");
			}
		}
	}

	public void move() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// Handle exception
		}
	}

}