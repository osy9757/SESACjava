package basic;

import java.math.BigDecimal;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
		byte b2 = 127;
		System.out.println(b2);

		char c = '헐';
		System.out.println(c);
		
		short s = 32767;
		System.out.println(s);
		
		int i = 2147483647;
		System.out.println(i);
		
		long L1 = 2147483648L;
		System.out.println(L1);
		
		double p = 3.1415926535;
		System.out.println(p);
		
		float p2 = 3.1415926535f;
		System.out.println(p2);
		
		System.out.println(2 - 1.1);
		
		BigDecimal bd1 = new BigDecimal("2");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));
		
		double pi = Math.PI;
		System.out.println(pi);
		
		
	}
}
