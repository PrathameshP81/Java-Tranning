package firstproject;
import java.util.*;

public class Eight {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		double base = in.nextDouble();
		double power = in.nextDouble();
		
		double result = Math.pow(base , power);
		
		System.out.println(base + "Raised to " + power + " is "  +  result);	
	}
}
