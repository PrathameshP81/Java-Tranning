package secondproject;
import java.util.*;


class InvalidAgeException extends Exception{
	InvalidAgeException(String ex){
		super(ex);
	}
}
public class CustomException  {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your Age : ");
		int age = in.nextInt();
		
		try {
			if(age < 18) {
				throw new InvalidAgeException("Don't Allowed to Drive");
			}else {
				System.out.println("You Are Allowed to Drive");
			}
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
}
