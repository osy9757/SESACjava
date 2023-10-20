package thread;

class MyClass {
	
}

public class ThreadTest0 extends MyClass implements Runnable {
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest0());
		t.start();
		for (int i=1; i<= 5; i++) {
			System.out.println("main() : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
