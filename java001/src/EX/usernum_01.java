package EX;

class A_2{
	int a = 3;
	int b = 4 ;
	void abc() {
		System.out.println("A 클래스 메서드");
		// TODO Auto-generated method stub

	}
	class B {
		int a = 5;
		int b =6;
		
		void abc() {
			System.out.println("어 클래스 메서드가");
		}
		
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			abc();
			
			System.out.println(A_2.this.a);
			System.out.println(A_2.this.b);
			A_2.this.abc();
		}
		
	}
}

public class usernum_01 {
	public static void main(String[] args) {
		A_2 a = new A_2();
	
		A_2.B b = a.new B();
		b.bcd();
	}
}
