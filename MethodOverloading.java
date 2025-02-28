package firstproject;

public class MethodOverloading {
	
	int add(int a,int b) {
		return a+b;
	}
	
	float add(float a,float b) {
		return a+b;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	public static void main(String [] a) {
		
		MethodOverloading m = new MethodOverloading();
		
		System.out.println(m.add(10, 20));
		System.out.println(m.add(1.2f, 4.5f));
		System.out.println(m.add(12.2, 43.5));
	}
	
}
