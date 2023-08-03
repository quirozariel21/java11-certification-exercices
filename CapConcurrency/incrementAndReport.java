import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.List;

/*
Benefits of using Consurrency classes for aotmic operations is that we don't need to worry
about synchronization. This improves code readibility and change of errors are reduced. Also atomic
operation concurrency classes are assumed to be more efficient that synchronization which ivolves locking resources.
*/
public class AtomicCodeExample {

	public static void main(String[] args) {

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			WorkerManager wm = new WorkerManager();
			for(int i = 0; i<10; i++) {
				service.submit(() -> wm.incrementAndReport()); // En este caso la impresion es en desorden
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
	private AtomicInteger  workersCount = new AtomicInteger(0);

	protected void incrementAndReport() {
		System.out.println(workersCount.incrementAndGet() + " ");
	}
}