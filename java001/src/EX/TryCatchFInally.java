package EX;

public class TryCatchFInally {
 public static void main(String[] args) {
	try {
		System.out.println(3/0);
		System.out.print("프로그램 종료");
	} catch (ArithmeticException e) {
		System.out.println("숫자는 0으로 나눌 수 없슨디ㅏ.");
	}
	
	try {
		System.out.println(3/0);
	} catch (ArithmeticException e) {
		System.out.println("숫자는 0으로 나눌 수 없습니다.");
	}finally {
		System.out.println("프로그램 종료");
	}
	
}
}
