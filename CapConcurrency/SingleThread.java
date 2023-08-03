import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
	
	public static void main(String args[])  throws Exception {

		ExecutorService service = null;
		Runnable task = () -> System.out.println("Printing this task...");

		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("==== Begin");
			service.execute(task);
			System.out.println("==== End");
		} finally {
				if(service != null) {
					service.shutdown();
					Thread.sleep(3);
					System.out.println(service.isTerminated());
				}

		}
	}
}