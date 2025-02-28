package firstproject;

public class LocalAccess {
	
	public static void main(String[] args) {
		GlobalAccess g = new GlobalAccess();
		
		g.setEmpid(1);
		g.setName("Prathamesh Patil");
		g.setSalary(1000);
		
		System.out.println(g);
	}
}
