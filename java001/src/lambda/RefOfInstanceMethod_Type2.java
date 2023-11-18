package lambda;

interface A_5 {
	int abc(String str);
}

public class RefOfInstanceMethod_Type2 {
	public static void main(String[] args) {
		A_5 a1 = new A_5() {
			@Override 
			public int abc(String str) {
				return str.length();
			}
		};
		
		A_5 a2 = (String str) -> str.length();
		
		A_5 a3 = String::length;
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕"));
		System.out.println(a3.abc("안녕"));
	}
}
