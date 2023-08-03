import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Use submit() method is recommend over execute()
public class SingleThreadWithCallableException {
	
	public static void main(String args[])  throws Exception {

		ExecutorService service = null;
		Runnable task = () -> System.out.println("Printing this task...");

		try {
			service = Executors.newSingleThreadExecutor();
			Callable<Integer> call = () -> { Thread.sleep(12000); return 20 + 10; };

			System.out.println("==== Begin");
			Future<Integer> result = service.submit(call); // submit method -> returns a Future instance that can be used to determiine whether the task is
			System.out.println(result.get(10, TimeUnit.SECONDS)); // complete
			System.out.println("==== End");	
		} catch(TimeoutException ex) {
				System.out.println("no alcanzo a tiempo");
		}finally {
				if(service != null) {
					service.shutdown();
					Thread.sleep(3);
					System.out.println(service.isTerminated());
				}

		}
	}
}