package thread_EX;

class MyData_2 {
	synchronized void abc() {
		for (int i = 0; i < 3; i++ ) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	synchronized void bcd() {
		for (int i = 0; i < 3; i++ ) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	void cde() {
		synchronized (new Object()) {
			for (int i = 0; i < 3; i++ ) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		}
	}
}

public class KeyObject_2 {
	public static void main(String[] args) {
		MyData_2 myData = new MyData_2();
		
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
	}
}
