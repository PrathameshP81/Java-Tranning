package firstproject;

public class BankDetails {
	
	public static void main(String[] args) {
		BankCustomers cus1 = new BankCustomers("Prathamesh","Jalgaon");
		BankCustomers cus2 = new BankCustomers("Vikram","Latur");
		
		BankInfo info = new BankInfo(101,"Prathamesh Patil",cus1);
		
		System.out.println(info);
	}
}	
