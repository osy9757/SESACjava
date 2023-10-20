package EX;

class A_7 {
	interface B {
		public abstract void bcd();
	}
}
class C_7 implements A_7.B {
	public void bcd() {
		System.out.println("inner interface class ");
	}
}

public class CreatObjectOFInnerInterface {
	public static void main(String[] args) {
		A_7.B ab = new C_7();
		C_7 c = new C_7();
		
		c.bcd();
		
		A_7.B b = new A_7.B() {
			public void bcd() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
		};
		b.bcd();
	}
}
