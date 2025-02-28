package firstproject;
import java.util.*;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("How many nos.");
		int x = in.nextInt();
		
		int [] a = new int[x];
		
		for(int i=0;i<a.length;i++) {		
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}
}
