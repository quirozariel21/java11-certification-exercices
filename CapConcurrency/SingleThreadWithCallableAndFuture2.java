import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.List;

public class SingleThreadWithCallableAndFuture2 {
	
	public static void main(String args[])  throws Exception {

		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			Callable<String> call = () -> { Thread.sleep(2000); return "MY TEST"; };

			System.out.println("==== InvokeAll ====");
			// This method return a List of results, it returns the results of all callables
			List<Future<String>> resultInvokeAll = service.invokeAll(List.of(call, call, call));
			System.out.println(resultInvokeAll.get(0).get());
			System.out.println("==== InvokeAll End");	

			System.out.println("==== InvokeAny ====");
			// This method return one result, it is the first execution that has finished
			String resultInvokeAny = service.invokeAny(List.of(call, call, call));
			System.out.println(resultInvokeAny);
			System.out.println("==== InvokeAny End");	

		}finally {
				if(service != null) {
					service.shutdown();
					Thread.sleep(3);
					System.out.println(service.isTerminated());
				}

		}
	}
}