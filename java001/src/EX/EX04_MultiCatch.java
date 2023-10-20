package EX;

public class EX04_MultiCatch {
	public static void main(String[] args) {
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("예외가 발생했습니다.");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("예외가 발생했습니다.");
		}
		
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			// TODO: handle exception
			System.out.println("예외가 발생했습니다.");
		}
	}
}
