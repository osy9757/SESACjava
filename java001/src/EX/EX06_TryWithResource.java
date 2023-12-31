package EX;

class A_9 implements AutoCloseable{
	String resource;
	A_9(String resouce) {
		this.resource = resouce;
	}
	
	public void close() throws Exception {
		if(resource!=null) {
			resource=null;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}

public class EX06_TryWithResource {
	public static void main(String[] args) {
		A_9 a1 = null;
		try {
			a1 = new A_9("특정파일");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 처리");
		} finally {
			if(a1.resource!=null) {
				try {
					a1.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		try (A_9 a2 = new A_9("특정파일");){
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외 처리");
		}
	}
}
