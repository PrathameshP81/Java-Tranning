package firstproject;

interface A{
	int a = 10;
	void show();
}
interface B extends A{
	int b = 20;
	void display();
}
interface C extends B{
	int c = 30;
	void see();
}

public class InterfaceDemo implements C {
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside Display Method");
	}

	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Inside Show Method");
	}

	
	public void see() {
		// TODO Auto-generated method stub
		System.out.println("Inside see Method");
	}
	
	public static void main(String [] args) {
		
		InterfaceDemo d = new InterfaceDemo();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		d.show();
		d.display();
		d.see();
	}
}
