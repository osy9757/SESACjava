package oop7;

public class Singleton {
	public static Singleton s = null;
	
	int score;
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
//	1. 생성자를 private
//	2. 자기자신을 참조하는 변수를 static 선언
//	3. 처음 1회만 인스턴스를 생성하고 리턴하는 메소드 작성
//	4. Class getInstance()로 싱글톤 인스턴스 획득
}
