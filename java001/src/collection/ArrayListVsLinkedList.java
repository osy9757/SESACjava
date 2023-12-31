package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		long startTime = 0, endTime =0;
		
		startTime = System.nanoTime();
		for( int i = 0; i < 100000; i++) {
			aList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList data input time = " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for( int i = 0; i < 100000; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList data input time = " + (endTime-startTime) + "ns");
		
		System.out.println("-----------------------------------------");
		
		startTime = System.nanoTime();
		for( int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList data search time = " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for( int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList data search time = " + (endTime-startTime) + "ns");

		System.out.println("-----------------------------------------");
		
		startTime = System.nanoTime();
		for( int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList data remove time = " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for( int i = 0; i < 100000; i++) {
			linkedList.add(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList data remove time = " + (endTime-startTime) + "ns");
		
	}
}
