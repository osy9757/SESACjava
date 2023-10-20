package EX;

interface A_6 {
	public abstract void abc();
}
class C_2 {
	void cde (A_6 a) {
		a.abc();
	}
}

public class EX04_AnonymousClass_4 {
	public static void main(String[] args) {
		C_2 c = new C_2();
		
		A_6 a = new A_6() {
			public void abc() {
				System.out.println("input 매개변수 전달");;
			}
		};
		c.cde(a);
		
		c.cde(new A_6() {
			public void abc() {
				System.out.println("입력 매개변수 전달");
			}
		});
	}
}
