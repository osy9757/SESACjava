package control;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		int n = 4;
		
		switch (n) {
		case 1:
		case 3:
			System.out.println("남");
			break;
		case 2:
		case 4:
			System.out.println("여");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("0부터 100 사이 입력");
//		int score = sc.nextInt();
//		
//		if ( 90 <= score && score <=100 ) System.out.println("A");
//		else if ( 80 <= score && score <90 ) System.out.println("B");
//		else if ( 70 <= score && score <80 ) System.out.println("C");
//		else if ( 60 <= score && score <70 ) System.out.println("D");
//		else System.out.println("F");
//		
//		if ( 90 <= score) System.out.println("A");
//		else if ( 80 <= score) System.out.println("B");
//		else if ( 70 <= score) System.out.println("C");
//		else if ( 60 <= score) System.out.println("D");
//		else System.out.println("F");
//		
		

		
	}
}
