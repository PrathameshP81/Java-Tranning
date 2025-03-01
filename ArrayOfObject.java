package secondproject;
import java.util.*;

class Employee{
	int empid;
	String name;
	double salary;
	
	Scanner in = new Scanner(System.in);
	void read() {
		empid = in.nextInt();
		name = in.next();
		salary = in.nextDouble();
	}
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}	
}
public class ArrayOfObject {
	public static void main(String [] args) {
		Employee [] e = new Employee[2];
		System.out.println("Enter Employee Details");
		
		for(int i=0;i<e.length;i++) {
			e[i] = new Employee();
			e[i].read();
		}
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i]);
		}
	}
}	
