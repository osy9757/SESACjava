package EX;

class A {}
class B extends A {}

public class UncheckedException {
	public static void main(String[] args) {
		System.out.println(3 / 0 );
		A a = new A();
		B b = (B) a;
		
		int[] array = {1,2,3};
		System.out.println(array[3]);
		
		int num = Integer.parseInit("10");
	}
}
