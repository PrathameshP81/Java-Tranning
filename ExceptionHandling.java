package secondproject;
import java.util.*;

public class ExceptionHandling {
	public static void main(String [] args) {
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter nos..");
			int x = in.nextInt();
			int y = in.nextInt();
			
			int result = x/y;
			String str = "Abc";
			int no = Integer.parseInt(str);
			
			System.out.println("Hello World");
			
		}
//		catch(InputMismatchException e) {
//			System.out.println("InputMissmatch Exception Found");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Aithmetic Exception Found");
//		}
//		catch(NumberFormatException e) {
//			System.out.println("NumberFormat Exception Found");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		finally {
			System.out.println("End of Program");
		}
		
	}
}
