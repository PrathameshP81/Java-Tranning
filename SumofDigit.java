package firstproject;

public class SumofDigit {
	
	public static void main(String [] a ) {
		int no = 12345;
		int temp = no , sum = 0;
		
		while(temp != 0) {
			int rem = temp % 10;
			sum = sum + rem;
			temp = temp / 10;
		}
		System.out.println("Sum of Digit of " + no + " :-  "+sum);
	}
}
