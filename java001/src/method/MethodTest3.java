package method;

import java.util.Scanner;

public class MethodTest3 {
	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6);
	}

	private static void print(int ... i) {
//		for (int n = 0 ; n < i.length; n++) {
//			System.out.print(i[n] + "\t");
//		}
//		System.out.println();
		
		for (int j : i) {
			System.out.print(j + "\t");
		}
		System.out.println();
	}

//	private static void print(int i, int j, int k) {
//		System.out.println(i + "," + j + "," + k);
//		
//	}
//
//	private static void print(int i, int j) {
//		System.out.println(i + "," + j);
//		
//	}
//
//	private static void print(int i) {
//			System.out.println(i);
//	}	
}
