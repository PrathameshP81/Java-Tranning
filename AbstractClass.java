package firstproject;

abstract class StudentFeatures{
	
	int roll;
	String name;
	int x = 10;
	
	StudentFeatures(){
		System.out.println("Student Features");
	}
	
	StudentFeatures(int roll , String nam){
		this.roll = roll;
		this.name = nam;
	}

	abstract void studentInfo();
	
}
public class AbstractClass extends StudentFeatures {
	
	String Company = "Mphasis";
	int x = 20;
	AbstractClass(){
		System.out.print("Inside Abstract Class");
	}
	AbstractClass(int roll , String name){
		super(roll, name);
	}
	void studentInfo() {
		System.out.println(roll + " " + name + " "+Company);
	}
	public static void main(String [] a) {
		AbstractClass ab = new AbstractClass(101,"Pratham");
		ab.studentInfo();
		System.out.println(ab.x);
	}
}
