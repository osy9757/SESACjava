package EX;

class A_1 {
	public int a = 3;
	protected int b = 4;
	int c =5 ;
	private int d = 6;
	void abc() {
		System.out.println("A class method abc()");
	}
	
	class B {
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}

}

public class CreatObject {
	public static void main(String[] args) {
		A_1 a = new A_1();
		A_1.B b = a.new B();
		b.bcd();
	}
}
