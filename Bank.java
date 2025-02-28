package firstproject;
import java.util.*;

public class Bank {
	
	int ano;
	String owner;
	double balance;
	
	Bank(int amount){
		balance = amount;
	}
	
	void checkBalanace() {
		System.out.println("Your Current Balance :- "+balance);
	}
	void WithDraw(int amount) {
		
		if(amount > balance) {
			System.out.println("Oops ! Insufficient Balance");
			return;
		}else if((balance - amount)  < 1000) {
			System.out.println("Oops ! Minimum Limit Reached");
		}else {
			balance = balance - amount;
			System.out.println(amount  + " Withdraw Successfully");
		}
	}
	void Deposite(int amount) {
		
		if(amount <= 0) {
			System.out.println("Oops ! Invalid Amount Entered");
			return;
		}
		balance += amount; 
		System.out.println(amount  + " Deposited Successfully");
	}
	public static void main(String[] args) {
	
		Bank b = new Bank(1000);
		int ch;
		Scanner in = new Scanner(System.in);
	
		
		do {
			System.out.println("1.Check Balance");
			System.out.println("2.Deposite Amount");
			System.out.println("3.withDraw Amount");
			System.out.println("4.Exit");
			
			System.out.println("Choice ?");
			ch = in.nextInt();
			
			switch(ch) {
			case 1 : b.checkBalanace();break;
			case 2 : System.out.println("Enter Amount ");
					 int depo = in.nextInt();
					 b.Deposite(depo);break;
			case 3 : System.out.println("Enter Amount ");
					 int draw = in.nextInt();
					 b.WithDraw(draw);break;
			case 4 : break;
			default : System.out.println("Oops ! Invalid Choice");
			}
		}while(ch != 4);
	}
}
