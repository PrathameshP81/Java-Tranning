package firstproject;

class Vikram1{
	int x = 10;
}
class Vikram2 extends Vikram1{
	int x = 100;
	
	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class VikramDemo extends Vikram2 {
	
	
	public static void main(String [] args) {
		VikramDemo v = new VikramDemo();
		v.show();
	}
}
