package firstproject;

class BankInfo {
	
	int accountno;
	String bankname;
	BankCustomers customer;
	
	BankInfo(int no , String bank , BankCustomers cus){
		this.accountno = no;
		this.bankname = bank;
		this.customer = cus;
	}

	public String toString() {
		return "BankInfo accountno=" + accountno  + ", customer=" + customer.cname + ", bankname=" + bankname + " address " + customer.address ;
	}
	
}
