import java.util.concurrent.*;
import java.util.stream.*;

/*
Example of DeadLock
*/
public class CyclicBarrierExamplePrint {
	private void waitingTillFinished(CyclicBarrier c) {
		try {
			c.wait();
			System.out.print("W");
		} catch(Exception e) {

		}
	}

	public void row(ExecutorService s) {
		var cb = new CyclicBarrier(5); // second reason to produce deadlock
		IntStream.iterate(1, i -> i+1)
					.limit(12)
					.forEach(i -> s.submit(() -> waitingTillFinished(cb)));
	}

	public static void main(String... args) {
		ExecutorService service = null; 
		System.out.println("---- JAVA ----");
		try {
			service = Executors.newCachedThreadPool();
			new CyclicBarrierExamplePrint().row(service);
		} finally {
			service.isShutdown(); // one reason to produce deadlock
			//service.shutdown();
		}
	}
}