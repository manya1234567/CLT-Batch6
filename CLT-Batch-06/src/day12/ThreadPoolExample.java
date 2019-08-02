package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.

public class ThreadPoolExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0;i<5;i++) {
			Runnable worker = new WorkerThread(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {  }
		}
	}

}
