package firstproject;
import java.util.*;
public class Seventh {
	public static void main(String [] args) {
		char ch;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any Letter");
		ch = in.next().toLowerCase().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("Vowel");	
		else
			System.out.println("Consonant");	
	}
}
