package lambda;

@FunctionalInterface
interface A_6 {
	int[] abc(int len);
}

public class RefOfArrayConstructor {
	public static void main(String[] args) {
		A_6 a1 = new A_6() {
			public int[] abc(int len) {
				return new int[len];
			}
		};
		A_6 a2 = (int len) -> {
			return new int[len];
		};
		
		A_6 a3 = int[]::new;
		
		int[] array1 = a1.abc(3);
		System.out.println(array1.length);
		int[] array2 = a1.abc(3);
		System.out.println(array2.length);
		int[] array3 = a1.abc(3);
		System.out.println(array3.length);
		
	}
}
