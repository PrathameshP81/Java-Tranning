package firstproject;

public class SchoolInfo {
	
	static String School = "Raosaheb Rupchand Vidyalaya\n";
	static int totalStudents = 300;
	static int totalteachers = 100;
	
	
	static {
		totalteachers++;
		System.out.println(School);
	}
	
	static void showSchoolDetails() {
		
		System.out.println("Total Students : "+ totalStudents);
		System.out.println("Total Teacherss : "+ totalteachers);
	}
	
	public static void main(String [] args) {
		showSchoolDetails();
	}
}
