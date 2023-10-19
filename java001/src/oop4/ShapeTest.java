package oop4;

public class ShapeTest {
	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rect());
		printArea(new Tri());
		
	}
	
	private static void printArea(Shape s) {
		if (s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("Circle : radius is " + c.r + ", Area is " + c.res);
		} else if (s instanceof Rect) {
			Rect r = (Rect) s;
			System.out.println("Rectangle : height is " + r.h + ",width is " + r.w + ", Area is " + r.res);
		} else if (s instanceof Tri) {
			Tri t = (Tri) s;
			System.out.println("Triangle : height is " + t.h + ",width is " + t.w + ", Area is " + t.res);
		}
		
		
	}
	
//	private static void printArea(Rect r) {
//		r.area();
//		System.out.println(r.res);		
//	}
//	
//	private static void printArea(Tri t) {
//		t.area();
//		System.out.println(t.res);		
//	}
//	
//	private static void printArea(Circle c) {
//		c.area();
//		System.out.println(c.res);		
//	}
}
