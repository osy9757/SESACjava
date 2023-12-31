package lambda;

interface A_2 {
	void method1();
}
interface B_2 {
	void method2(int a);
}
interface C_2 {
	int method3();
}
interface D_2 {
	double method4(int a, double b);
}
public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		A_2 a = () -> System.out.println("input x return x function ");
		
		B_2 b = (k) -> System.out.println("input o return x function");
		
		C_2 c = () -> {return 4;};
		C_2 c2 = () -> 4;

		D_2 d = (x, y) -> {return x * y;};
		D_2 d2 = (x, y) ->  x * y;

		a.method1();
		b.method2(2);
		System.out.println(c.method3());
		System.out.println(d.method4(4, 3.14));
		System.out.println(c2.method3());
		System.out.println(d2.method4(4, 3.14));
	}
}
