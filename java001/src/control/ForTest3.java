package control;

import java.util.Scanner;

public class ForTest3 {
	public static void main(String[] args) {
			for (int k=2 ; k <= 6;k+=4) {
				for (int j = 1 ; j <= 9 ; j++) {
					for (int i = k ; i <= 9 && i < k+4 ; i++) {
					System.out.print(i + " * " + j + " = " + (i*j) + "\t" );
					}
					System.out.println();
				}
				System.out.println();
			}					
	}
}
