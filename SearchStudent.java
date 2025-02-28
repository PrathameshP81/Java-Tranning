package firstproject;
import java.util.*;

public class SearchStudent {
	int roll;
	String name;
	
	void read() {
		System.out.println("Enter Roll no. And Name");
		Scanner in = new Scanner(System.in);
		
		roll = in.nextInt();
		name = in.nextLine();
	}
	void show() {
		System.out.print(roll + " " + name);
	}
	public static void main(String [] args) {
		SearchStudent [] students = new SearchStudent[2];
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<students.length;i++) {
			students[i] = new SearchStudent();
			students[i].read();
		}
		
		System.out.println("Enter roll");
		int roll = in.nextInt();
		
		for(int i=0;i<students.length;i++) {
			if(students[i].roll == roll) {
				System.out.println(students[i].roll);
				System.out.println(students[i].name);
			}
		}
		
	}
}

