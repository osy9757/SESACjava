package Generic;

class A_2 {
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface {
	public abstract void print();
}

class B_2 {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A_2 a = new A_2();
		a.method1(5.8);
		
		B_2 b = new B_2();
		b.method1(new MyInterface() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("print() 구현");
			}
		});
	}
}
