package exception;

class MyResource implements AutoCloseable{
	public void close() throws Exception {
		System.out.println("자원반납~~");
	}
}

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		try(MyResource m = new MyResource()){
			System.out.println("try 블록");
			if (true) throw new RuntimeException("강제예외발생");
			System.out.println("A");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch 블록");
		}
		System.out.println("종료~");
	}
}
