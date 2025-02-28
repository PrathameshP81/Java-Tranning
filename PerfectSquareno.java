package firstproject;

public class PerfectSquareno {
	public static void main(String [] args) {
		
		int no = 144;
		
		long  root = (long) Math.sqrt(no);
		
		if(root * root == no)
			System.out.println("Perfect Square");
		else
			System.out.println("Not Perfect Square");
		
	}
}
