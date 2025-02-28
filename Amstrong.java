package firstproject;

public class Amstrong {
	public static void main(String [] a) {
		int no = 153 , sum=0;
		int temp = no;
		
		while(temp != 0) {
			int rem = temp % 10;
			sum += rem*rem*rem;
			temp = temp / 10;
		}
		
		if(no == sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not Amstrong Number");
	}
}
