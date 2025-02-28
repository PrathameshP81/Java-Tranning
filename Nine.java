package firstproject;
import java.util.*;

public class Nine {
	
	public static void main(String [] args) {
		
		
		int com1 , img1;
		int com2 , img2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st Complex and Imaginary Part\n");
		com1 = in.nextInt();
		img1 = in.nextInt();
		
		System.out.println("Enter 2nd Complex and Imaginary Part\n");
		com2 = in.nextInt();
		img2 = in.nextInt();
		
		
		double comResult = com1 + com2;
		double imgResult = img1 + img2;
		
		System.out.println("Result\n");
		System.out.println(comResult + " + "+imgResult + "  i");
		
	}
}
