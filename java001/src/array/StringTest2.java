package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTest2 {
	public static void main(String[] args) {
		String str1 = "안녕" + "하세요" + "!";
		
		System.out.println(str1);
		
		String str2 = "반갑";
		str2 += "습니다";
		str2 += "!";
		
		System.out.println(str2);
		
		String str3 = "안녕" + 1;
		String str4 = "안녕" + String.valueOf(1);
		String str5 = "안녕" + "1";
		
		
	}
}
