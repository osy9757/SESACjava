package EX;

class MinusException extends Exception {
	public MinusException() {
		super();
	}
	
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception {
	public OverException() {
		super();
	}
	
	public OverException(String message) {
		super(message);
	}
}

class A_12 {
	void checkScore(int score) throws MinusException, OverException {
		if (score <0) {
			throw new MinusException("Minus Error");
		} else if (score>100) {
			throw new OverException("Over 100 Error");			
		} else {
			System.out.println("valid score");
		}
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
		A_12 a = new A_12();
		
		try {
			a.checkScore(65);
			a.checkScore(150); // 요기서 던져서 아래껀 출력 X
			a.checkScore(-10);
		} catch (MinusException | OverException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
