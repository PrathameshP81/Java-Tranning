package firstproject;

class Peroson{
	String name;
	int age;
	
	Peroson(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class SuperDemo extends Peroson{
	
	String work;
	int salary;
	
	SuperDemo(String name , int age , String work , int salary){
		super(name , age);
		this.work = work;
		this.salary = salary;
	}
	public String toString() {
		return name + " "+ age + " " + work + " " + salary;
	}
	public static void main(String[] args) {
		SuperDemo s = new SuperDemo("Pratham",21,"Software Engineeir",1000);
		
		System.out.println(s);
	}
}
