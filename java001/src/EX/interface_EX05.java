package EX;

interface A {
	int a = 3;
	void abc();
}

public class interface_EX05 {
	public static void main(String[] args) {
		A a1 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		A a2 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}
}
