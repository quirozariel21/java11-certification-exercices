import java.util.concurrent.*;

public class SimpleExecutorService {

	public static void main(String... args) {
			ExecutorService service = null;
			Runnable task1 = () -> System.out.println("Printing zoo inventory");
			Runnable task2 = () -> { 
									for(int i = 0; i < 3; i++)  
										System.out.println("Printing record: " + i);
									};

			try {
				service = Executors.newSingleThreadExecutor();
				System.out.println("Begin...");
				service.execute(task1); // method execute -> completes the task asynchronously. Because the return type of the method
				service.execute(task2); // is void, it does not tell us anything about the result of the task. it is considered a 
				service.execute(task1); // "fire-and-forget" method, as once it is submitted, the results are not directly available to the calling thread.
				System.out.println("End.....");
			} finally {
				if(service != null)
					service.shutdown();
			}
	}
}

/*
Possible output:
begin
Printing
Printing
Printing
end
Printing
Printing
zoo inventory
record: 0
record: 1
record: 2
zoo inventory


With a single‐thread executor, results are guaranteed to be executed
sequentially. Notice that the end text is output while our thread executor
tasks are still running. This is because the main() method is still an
independent thread from the ExecutorService .


*/