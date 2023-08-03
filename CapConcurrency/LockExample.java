import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import java.util.List;

public class LockExample {

	private static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws Exception{

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			WorkerManager wm = new WorkerManager();
			for(int i = 0; i<10; i++) {
				service.submit(() -> wm.incrementAndReport(lock));
			}
			System.out.println("End.....");
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}

class WorkerManager {
	private int  workersCount = 0;

	protected void incrementAndReport(Lock lock) {


		//if(lock.tryLock()) { // It is imperative that your program always checks the return value. It tells your program whether
			try{ // the lock needs to be released later

				lock.lock();
				System.out.println("Hilo obtenido");		
				System.out.println((++workersCount) + " ");
			} finally {
				lock.unlock(); // unlock() method must be called the same number of times the lock was granted.
			}
		//} else {
		//	System.out.println("Nose pudo aquirir el hilo");
		//}
		
	}
}