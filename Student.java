package firstproject;
import java.util.*;

public class Student {
	
	int roll;
	String name;
	static String college = "VIIT Pune";
	
	void read() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Student Informataion");
		roll = in.nextInt();
		name = in.nextLine();
		
	}
	void show() {
		System.out.println(roll + " " + name);
	}
	public static void main(String [] args) {
		int std;
		Scanner in = new Scanner(System.in);
		
		System.out.println("How Many Students");
		std = in.nextInt();
			
		Student [] s = new Student[std];
		System.out.println(s[0].college);
		for(int i=0;i<s.length;i++) {
			s[i] = new Student();
			s[i].read();
		}
		
		System.out.println("Employee Info.....");
		
		for(int i=0;i<s.length;i++) {
			s[i].show();
		}
	}
}
