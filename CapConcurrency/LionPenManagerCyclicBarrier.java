import java.util.concurrent.*;

/*
THREAD POOL SIZE AND CYCLIC BARRIER LIMIT
If you are using a thread pool, make sure that you set the number of
available threads to be at least as large as your CyclicBarrier limit
value. For example, what if we changed the code in the previous
example to allocate only two threads, such as in the following
snippet?
ExecutorService service =
Executors.newFixedThreadPool(2);
In this case, the code will hang indefinitely. The barrier would never
be reached as the only threads available in the pool are stuck waiting
for the barrier to be complete. This would result in a deadlock,
which will be discussed shortly.
*/
public class LionPenManagerCyclicBarrier {
	
	private void removeLions() {
		System.out.println("removing lions");
	}

	private void cleanPen() {
		System.out.println("cleaning the pen");
	}

	private void addLions() {
		System.out.println("adding lions");
	}

	private void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		try {
		removeLions();
		System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 1");
		c1.await();
		cleanPen();
		System.out.println(Thread.currentThread().getName() +
                                " waiting at barrier 2");
		c2.await();
		addLions();
		} catch (InterruptedException | BrokenBarrierException e) {

		}
		
	}

	public static void main(String args[]) {
		ExecutorService service = null;

		try {

			service = Executors.newFixedThreadPool(4);
			var manager = new LionPenManagerCyclicBarrier();
			var c1 = new CyclicBarrier(4);
			var c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
			for(int i=0; i< 4; i++) {
				service.submit(()-> manager.performTask(c1, c2));
			}
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}