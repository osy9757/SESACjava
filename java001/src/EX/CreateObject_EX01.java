package EX;

class A_3 {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	static class B {
		void bcd() {
			System.out.println(b);
			
			method2();
		}
	}
}


public class CreateObject_EX01 {
	public static void main(String[] args) {
		A_3.B b = new A_3.B();
		
		b.bcd();
	}
}
