package firstproject;

public class GlobalAccess {
	private int empid;
	private String name;
	private double salary;
	
	
	public String toString() {
		return "GlobalAccess [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
