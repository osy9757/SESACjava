package EX;

class A_10 {
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Class cls =Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
			// TODO: handle exception
		}
	}
}

class B_10 {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
		}
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException{		
			Class cls =Class.forName("java.lang.Object");
			Thread.sleep(1000);
		
	}
}

public class ThrowsException_3 {
	public static void main(String[] args) {
		
	}
}
