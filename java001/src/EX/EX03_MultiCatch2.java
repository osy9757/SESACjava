package EX;

public class EX03_MultiCatch2 {
	public static void main(String[] args) {
//		try {
//			System.out.println(3/1);
//			int num = Integer.parseInt("10A");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("숫자는 0으로 나눌 수 없습니다.");
//		} catch (NumberFormatException e) {
//			// TODO: handle exception
//			System.out.println("숫자로 바꿀 수 없습니다.");
//		} finally {
//			System.out.println('프로그램 종료');
//		}
		
		try {
			System.out.println(3/1);
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자로 바꿀 수 없습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}  finally {
			System.out.println("프로그램 종료");
		}
		
	}
}
