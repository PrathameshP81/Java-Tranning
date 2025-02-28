package firstproject;

public class StaticDemo {
	static int a = 100;
	int y = 50;
	
	static {
		System.out.println("Hello World");
		System.out.println(a);
	}
	static void show() {
		System.out.println(a);
	}
	public static void main(String [] a) {
		System.out.println("Main Method");
		StaticDemo s = new StaticDemo();
		
	}
}

//1.Python
//2.Oops
//3.Statistics
//4.ML Models / Processing 
//	models used for tranning
//	processing ( Numpy / Pandas)
//5.Deep Learning (Nural Network) V.imp
//6.NLP
//7.Generative AI
