package firstproject;
import java.util.*;

public class Third {
	public static void main(String [] as) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 nos.");
		
		int a,b,c,d,e;
		
		a = in.nextInt();
		b = in.nextInt();
		c= in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
	
		System.out.print(" Sum  "+(a+b+c+d+e)+"\n");
		System.out.print(" Average  "+(a+b+c+d+e)/5);
			
	}
}
