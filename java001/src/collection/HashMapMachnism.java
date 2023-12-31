package collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Hashtable;
import java.util.LinkedHashMap;

class A_2 {
	int data;
	public A_2(int data) {
		this.data = data;
	}
}

class B_2 {
	int data;
	public B_2(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B_2) {
			if(this.data == ((B_2)obj).data) 
			return true;
		}
		return false;
	}
}

class C_2 {
	int data;
	public C_2(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C_2) {
			this.data = ((C_2)obj).data;
			return true;
		}
		return false;
		}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);
	}
}
public class HashMapMachnism {
	public static void main(String[] args) {
		Map<A_2, String> hashMap1 = new LinkedHashMap<>();
		A_2 a1 = new A_2(3);
		A_2 a2 = new A_2(3);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() + ", " + a2.hashCode());
		
		hashMap1.put(a1, "첫 번째");
		hashMap1.put(a2, "두 번째");
		System.out.println(hashMap1.size());
		System.out.println();
		
		Map<B_2, String> hashMap2 = new LinkedHashMap<>();
		B_2 b1 = new B_2(3);
		B_2 b2 = new B_2(3);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode() + ", " + b2.hashCode());
		
		hashMap2.put(b1, "첫 번째");
		hashMap2.put(b2, "두 번째");
		System.out.println(hashMap2.size());
		System.out.println();
		
		Map<C_2, String> hashMap3 = new LinkedHashMap<>();
		C_2 c1 = new C_2(3);
		C_2 c2 = new C_2(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		
		hashMap3.put(c1, "첫 번째");
		hashMap3.put(c2, "두 번째");
		System.out.println(hashMap3.size());
		System.out.println();
	
	}
}
