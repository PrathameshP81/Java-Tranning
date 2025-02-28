package firstproject;
import java.util.*;
public class FindMaximuminMatrix {
	public static void main(String [] args) {
		int [][] mat = new int[3][3];
		int maxi = mat[0][0];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 3 X 3  Matric");
		
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				mat[i][j] = in.nextInt();
			}
		}
		
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j] > maxi)
					maxi = mat[i][j]; 
			}
		}
		
		System.out.println("Maximum No. "+maxi);
	}
}
