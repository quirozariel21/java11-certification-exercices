import java.util.concurrent.*;

public class SimpleFutureExample {

	public static void main(String... args) throws Exception {
			ExecutorService service = null;

			try {
				service = Executors.newSingleThreadExecutor();
				System.out.println("Begin...");
				var future = service.submit(new MyCallable()); 
				System.out.println(future.get()); // FUTURE.get() will block until there is a value to return or there is an exception
				System.out.println("End.....");
			} finally {
				if(service != null)
					service.shutdown();
			}
	}
}


class MyCallable implements Callable<String> {
	public String call() throws Exception {
		Thread.sleep(50000);
		return "DONE";
	}

}

/*
OUTPUT
-----

	DONE
*/