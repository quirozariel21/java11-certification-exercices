import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.List;

public class SynchronizedExample {

	public static void main(String[] args) {

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			WorkerManager wm = new WorkerManager();
			for(int i = 0; i<10; i++) {
				service.submit(() -> wm.incrementAndReport()); // En este caso la impresion es ORDENADA
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

	protected void incrementAndReport() {
		synchronized(this) {
			System.out.println((++workersCount) + " ");
		}
		
	}
}