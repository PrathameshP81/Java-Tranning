package firstproject;

class Parent{
	int x = 10;
	
	void show() {
		System.out.println("Inside Parent Class");
	}
}
class Child extends Parent{
	
	int x = 20;
	
	void show() {
		System.out.println("Inside Child Class");
		System.out.println(x);
		System.out.println(x);
	}
}
public class OverridingDemo {
	public static void main(String [] args) {
		Parent p = new Child();
		p.show(); 
		System.out.println(p.x);
	}
}
