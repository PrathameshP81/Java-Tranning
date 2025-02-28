package firstproject;
import java.util.*;
abstract class Bankfeatures{
	
	abstract void deposite();
	abstract void withdraw();
	abstract void checkBalance();
	int minBalance;
	
	Bankfeatures(int x){
		minBalance = x;
	}
	
	void Bank() {
		System.out.println("******** Bank of Maharashatra ********");
	}

}
public class BankSystem extends Bankfeatures{
	
	Scanner in = new Scanner(System.in);
	
	BankSystem(){
		super(1000);	
	}
	
	void checkBalance() {
		System.out.println("Your Balance :- "+minBalance);
	}
	
	void deposite() {
		System.out.println("Enter Amount ");
		int amount = in.nextInt();
		
		if(amount < 0 ) {
			System.out.println("Invalid Amount Entered !!");
		}else {
			minBalance += amount;
			System.out.println(amount + "Rs. Deposited Successfully.");
		}
			
	}
	void withdraw() {
		System.out.println("Enter Amount ");
		int amount = in.nextInt();
		
		if(amount < 0 ) {
			System.out.println("Invalid Amount Entered !!.");
			return;
		}else
		if(amount >= minBalance || (minBalance-amount <= minBalance)) {
			System.out.println("withDraw Failed ! Minimum Balance Reached.");
			return;
		}else {
			minBalance -= amount;
			System.out.println(amount + "Rs. withdraw Successfully");
		}	
	}
	public static void main(String [] a) {
		BankSystem b = new BankSystem();
		int ch;
		
		
		Scanner in = new Scanner(System.in);
		b.Bank();
		
		do {
			System.out.println("1.Check Balance");
			System.out.println("2.Deposite");			
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("Choice ? ");
			ch = in.nextInt();
			
			switch(ch) {
			case 1 : b.checkBalance();break;
			case 2 : b.deposite();break;
			case 3 : b.withdraw();break;
			case 4 : break;
			default : System.out.println("Invalid Choice");
			}
		}while(ch != 4);
	}
}
