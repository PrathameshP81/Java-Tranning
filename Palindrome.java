package firstproject;

public class Palindrome {
	public static void main(String [] args) {
		int no = 111;
		int temp = no , reverse = 0;
		
		while(temp != 0) {
			int rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}
		
		if(no == reverse) {
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}
