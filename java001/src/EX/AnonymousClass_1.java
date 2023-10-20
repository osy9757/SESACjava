package EX;

interface C {
	public abstract void bcd();
}

class A_5 {
	C c = new B();
	void abc() {
		c.bcd();
	}
	class B implements C {
		public void bcd() {
			System.out.println("instance inner class");
		}
	}
}

public class AnonymousClass_1 {
	public static void main(String[] args) {
		A_5 a = new A_5();
		a.abc();
	}
}
