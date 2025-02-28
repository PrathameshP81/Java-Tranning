package firstproject;
import java.util.*;

class Students {
	String name , gender;
	int age; 
	
	Scanner in = new Scanner(System.in);
	
	void readbio() {
		
		System.out.println("Enter Name , Age and Gender ");
		name = in.nextLine();
		age = in.nextInt();
		gender = in.nextLine();
	}
	
}
class StudentProfile extends Students{
	int phy , chem , math;
	
	void readmarks() {	
		System.out.println("Enter Marks ");
		phy = in.nextInt();
		chem = in.nextInt();
		math = in.nextInt();
	}
}
public class InheritanceDemo extends StudentProfile {
	
	public String toString(){
		return name + " "+ age + " "+ gender + " "+phy + " "+chem+" "+math;
	}

	public static void main(String [] args){
		
		InheritanceDemo  d = new InheritanceDemo();
		
		d.readbio();
		d.readmarks();
		System.out.println(d);
		
		
	}
}
