package control;

import java.util.Scanner;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3 ; i <= 1000 ; i+=3) {
			sum += i;
		}
		System.out.println(sum);
	}
}
