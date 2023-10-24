package lambda;

@FunctionalInterface //이게 에러가 안나면 lamda식 가능하다는 걸 알 수 있음
interface A_3 {
	void abc();
}

class B_3 {
	void bcd() {
		System.out.println("method");
	}
}

public class RedOfInstanceMethod {
	public static void main(String[] args) {

		A_3 a = new A_3() {
			public void abc() {
				B_3 b = new B_3();
				b.bcd();
			}
		};	
		
		A_3 a2 = () -> {
			B_3 b = new B_3();
			b.bcd();
		};
		
		B_3 b = new B_3();
		A_3 a3 = b::bcd;
		
		a.abc();
		a2.abc();
		a3.abc();
		
	}
}
