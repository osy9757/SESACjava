package thread_EX;

class MyThread_2 extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("-- sleep() 진행중 interrupt 발생");
			for(long i = 0; i < 2000000000000000000L; i++) {}
		}
	}
}

public class TimeWaitinf_sleep {
	public static void main(String[] args) {
		MyThread_2 myThread = new MyThread_2();
		myThread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("MyThread State = " + myThread.getState());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("MyThread State = " + myThread.getState());
	}
}
