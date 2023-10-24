package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		
		hMap1.put(2,  "나다라");
		hMap1.put(1,  "가나다");
		hMap1.put(3,  "다라마");
		
		System.out.println(hMap1.toString());
		
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		
		hMap2.putAll(hMap1);
		
		System.out.println(hMap2.toString());
		
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "라라라");
		System.out.println(hMap2.toString());
		
		hMap2.replace(1, "가가가", "나나나");
		hMap2.replace(2, "다다다", "라라라");
		System.out.println(hMap2.toString());
		
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		System.out.println();
		
	}
}
