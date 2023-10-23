package thread_EX;

class MyThread1 extends Thread {
	public void run() {
		for(long i = 0; i < 2000000000000000000L; i++) {}
	}
}

class MyThread2 extends Thread {
	MyThread1 myThread1;
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("-- join 진행 중 interrupt 발생");
			for(long i = 0; i < 2000000000000000000L; i++) {}
		}
	}
}

public class TimeWaiting_Join {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		myThread1.start();
		myThread2.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		myThread2.interrupt();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		
	}
}
