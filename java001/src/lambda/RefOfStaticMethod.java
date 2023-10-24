package lambda;

interface A_4 {
	void abc();
}

class B_4 {
	static void bcd() {
		System.out.println("method");
	}
}

public class RefOfStaticMethod {
	public static void main(String[] args) {
		A_4 a1 = new A_4() {
			public void abc() {
				B_4.bcd();
			}
		};
		
		A_4 a2 = () -> B_4.bcd();
		A_4 a3 = B_4::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	}
}
