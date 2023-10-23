package EX;

class MyThread extends Thread {
	public void run() {
		for ( long i = 0; i < 2_000_000_000_000_000_000L; i++  ) {}


		System.out.println(getName() + "우선순위 : " + getPriority());
	}
}

public class ThreadOrioertyies_2 {
	public static void main(String[] args) {
		
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());
		
		for(int i = 0; i <3; i++ ) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		for (int i = 0; i< 12; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			if(i==11) thread.setPriority(10);
			thread.start();
		}
	}	
}
