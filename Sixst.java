package firstproject;
import java.util.*;
public class Sixst {
	public static void main(String [] args) {
		int ch,x=0,y=0;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("******* Menu Here ********\n");
			System.out.println("1.Addition\n");
			System.out.println("2.Substraction\n");
			System.out.println("3.Multiplication\n");
			System.out.println("4.Divison\n");
			System.out.println("5.Exit\n");
			System.out.println("Choice ?");

			ch = in.nextInt();
			
			if(ch != 5) {
				System.out.println("Enter nos.");
				x = in.nextInt();
				y = in.nextInt();	
			}
			
			switch(ch) {
			case 1 : System.out.println("Addition " + (x+y));break;
			case 2 : System.out.println("Substraction "+ (x-y));break;
			case 3 : System.out.println("Multiplication " + (x*y));break;
			case 4 : System.out.println("Division "+(x/y));break;
			case 5 : System.out.println("Good Bye....");break;
			default : System.out.println("Invalid Choice");
			}
	
		}while(ch != 5);
	}
}
