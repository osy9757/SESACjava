package example;

public class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
	
	public class Inheritance {
		public static void main(String[] args) {
			Human h = new Human();
			h.name = "kim";
			h.age = 11;
			h.eat();
			h.sleep();
			
			Student s = new Student();
			s.name = "Min";
			s.age = 16;
			s.StudentID = 128;
			s.eat();
			s.sleep();
			s.goToSchool();
			
			Worker w = new Worker();
			w.name = "Bong";
			w.age = 45;
			w.workerID = 128;
			w.eat();
			w.sleep();
			w.goToWork();
					
		}
	}
}