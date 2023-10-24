package lambda;

interface A {
	void abc();
}
class B implements A {
	@Override
	public void abc() {
		System.out.println("매서드내용 1");
	}
}

public class OOPvsFP {
	public static void main(String[] args) {
		A a1 = new B();
		a1.abc();
		
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("method 2");
			}
		};
		a2.abc();
		
		A a3 = () -> {System.out.println("method 3");};
		a3.abc();
	}
}
