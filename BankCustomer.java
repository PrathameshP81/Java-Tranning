package firstproject;

class Animal{
	void show() {
		System.out.println("Animal Travels");
	}
}
class Cow extends Animal{
	void show() {
		System.out.println("Cow Walks on Foot");
	}
}
class Dove extends Animal{
	void show() {
		System.out.println("Dove Fly in Sky");
	}	
}
class Fish extends Animal{
	void show() {
		System.out.println("Fish swim in Water");
	}	
}
public class BankCustomer {
	
	public static void main(String[] args) {
		Animal a;
		
		a = new Fish();
		a.show();
	}
}
