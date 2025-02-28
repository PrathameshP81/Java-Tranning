package firstproject;

public class Ten {
	
	String name, address ,gender;
	
	Ten(String name , String address , String gender){
		this.name = name;
		this.address = address;
		this.gender = gender;
	}
	
	public String toString() {
		return "Ten [name=" + name + ", address=" + address + ", gender=" + gender + "]";
	}
	public static void main(String[] args) {
		Ten t = new Ten("Prathamesh","Jalgaon","Male");
		
		System.out.println(t);
		
	}
}
