package EX;

class A_4 {
	int a = 3;
	void abc() {
		int b = 5;
		
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
//				b = 7;
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A_4 a = new A_4();
		a.abc();
	}
}
