package control;

import java.util.Scanner;

public class WhileTest3 {
	public static void main(String[] args) {
		
		int k = 2;		
		while(k <= 6) {
			int j = 1;
			while(j<=9) {		
				int i = k;
				while(i <= 9 && i < k + 4) {
					System.out.print( i + "*" + j + "=" + (i*j) + "\t");
					i += 1;
				}
				System.out.println();
				j += 1;
			}
			System.out.println();
			k += 4;	
		}
	}
}
