package lambda;

interface A_7{
	B abc();
}
class B {
	B(){
		System.out.println("first inpit");
	}
	B(int k) {
		System.err.println("second input");
	}
}

public class RefOfClassConstructor {
	public static void main(String[] args) {
		A_7 a1 = new A_7() {
				public B abc() {
					return new B();
				}
			};
		}
		 	
	}
}
