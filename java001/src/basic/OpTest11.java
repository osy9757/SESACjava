package basic;

public class OpTest11 {
	public static void main(String[] args) {
		
		
		int n = -24;		
		
		System.out.println(n>0 ? "양수":
						   n<0 ? "음수":
								 "0");
		
		System.out.println(n == 0 ? "0" :
						  (n&1) == 1 ? "홀수" :
						               "짝수");
		
	}
}
