package method;

public class MethodTest1 {
	public static void main(String[] args) {
		print();
		welcom("Names");
		System.out.println("종료");
	}

	private static void welcom(String name) {
		System.out.println(name + "님 안녕하세요~" );		
	}

	private static void print() {
		System.out.println("------------");
		System.out.println("Name");
		System.out.println("------------");
		
		return;
	}
}
