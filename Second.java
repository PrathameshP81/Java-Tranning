package firstproject;
import java.util.*;

public class Second {
	public static void main(String [] as) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Name :- ");
		String str = in.nextLine();

		System.out.println("Enter 2 nos");	
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.println("\n Sum of 2 nos. " + (x+y));	
		
	}
}
