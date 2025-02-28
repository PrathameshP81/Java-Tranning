package firstproject;
import java.util.*;
public class Fourth {
	public static void main(String [] args) {
		int x,y;
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		
		boolean result = (x>y) ? true : false;
		System.out.println(result);
	}
}
