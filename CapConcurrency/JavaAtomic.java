import java.util.concurrent.atomic.AtomicInteger;


/*
Atomic operations are necessily in mullti-threaded environment to avoid data incosistency.
*/
public class JavaAtomic {
		
		    public static void main(String[] args) throws InterruptedException {
		    	ProcessingThread	pt = new ProcessingThread();
		    	Thread t1 = new Thread(pt, "t1");
		    	t1.start();
		    	Thread t2 = new Thread(pt, "t2");
		    	t2.start();
		    	t1.join();
		    	t2.join();
		    	System.out.println("Processing count = " + pt.getCount());

		    	//System.out.println("================ ATOMIC ================");
		    	//	compareAndSet(expectedValue, newValue) is meant exactly for this purpose. 
		    	//It first checks if the current value is same as the expected value and if so, updates to the new value.
		    	//status.compareAndSet(oldStatus, newStatus);
			}
}

class ProcessingThread implements Runnable {
	private AtomicInteger count = new AtomicInteger();

	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			processSomething(i);
			count.incrementAndGet();
		}
	}

	public int getCount() {
		return this.count.get();
	}

	public void processSomething(int i) {
		// processing same job
		try {
			Thread.sleep(i * 1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}