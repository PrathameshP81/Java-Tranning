package firstproject;

import java.util.Arrays;

public class NumberToWord {
	
	public static void main(String[] args) {
		String [] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		int no = 123;
		String nos = Integer.toString(no);
		String result = "";
		
		
		for(int i=0;i<nos.length();i++) {
			result = result + str[Integer.parseInt(nos.charAt(i)+"")] + " ";
		}
		System.out.println(result);
	}
}
