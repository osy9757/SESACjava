package thread_EX;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		Thread.State state;
		
		Thread myThread = new Thread() {
			public void run() {
				for (long i = 0; i <1000000000; i++) {}
			}
		};
		
		state = myThread.getState();
		System.out.println("my Thread state = " + state);
		
		myThread.start();
		state = myThread.getState();
		System.out.println("my Thread state = " + state);
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		state = myThread.getState();
		System.out.println("my Thread state = " + state);
	}
}
