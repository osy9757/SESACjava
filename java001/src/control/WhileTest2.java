package control;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		int sum = 0;
		int i =3;
		while(i<=1000) {
			sum += i;
			i+=3;
		}
		System.out.println(sum);
		
	}
}
