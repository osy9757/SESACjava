package control;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int c1,c2,c3;
		int h1,h2,h3;
		int s,b,count=0;
		
		c1 = (int) (Math.random()*10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);
		
		do {
			s = b = 0;
			System.out.println("0부터 999 사이 입력 (중복되지 않게)");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1 == c1) s++;
			else if (h1 == c2 || h1 == c3) b++;
			if(h2 == c2) s++;
			else if (h2 == c1 || h2 == c3) b++;
			if(h3 == c3) s++;
			else if (h3 == c1 || h3 == c2) b++;
			
			System.out.println(s+"S"+b+"B");
			
			count++;
		} while(s!=3);
		System.out.println(count);		
		
		sc.close();
		
	}
}
