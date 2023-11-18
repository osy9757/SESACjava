package lambda;

interface A_8 {
	B abc(int k);
}

class B_8 {
	B_8() {
		System.out.println("fist input");
	}
	B_8(int k) {
		System.out.println("second input");
	}
}

public class RefOfClassConstructor2 {
	public static void main(String[] args) {
		A_8 a1 = new A_8() {
			public B_8 abc(int k) {
				return new B_8(3);
			}
		};
		A_8 a2 = (int k) -> new B_8(3);
		A_8 a3 = B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}
}
