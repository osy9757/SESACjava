package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
//		int[] i = new int[3];
//		i[0] = 100;
//		i[1] = 200;
//		i[2] = 300;

//		int[] i = new int[] {100,200,300};
		
		int[] i = {100,200,300};
		
//		for (int j = 0; j < i.length; j++) {
//			System.out.println(i[j]);
//		}
//		
//		System.out.println(Arrays.toString(i));
		
		for(int temp:i) {
			System.out.println(temp);
		}
	}
}
