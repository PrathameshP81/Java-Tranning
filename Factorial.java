package firstproject;

public class Factorial {
	public static void main(String [] a) {
		
		int n = 4;
		int f = 1;
		
		for(int i=1;i<=n;i++) {
			f = f * i;
		}
		
		System.out.println(f);
	}
}
