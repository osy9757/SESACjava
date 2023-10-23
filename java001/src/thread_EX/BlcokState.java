package thread_EX;

class MyBlockTest {
	MyClass mc = new MyClass();
	
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t2 = new Thread("thread2") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3") {
		public void run() {
			mc.syncMethod();
		};
	};
	
	void startAll() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class MyClass {
		synchronized void syncMethod() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println("===" + Thread.currentThread().getName() + "===");
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
			for(long i = 0; i < 2000000000000000000L; i++) {}
		}
	}
}

public class BlcokState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();
	}
}
