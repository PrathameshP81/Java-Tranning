package firstproject;

public class ArraySortedorNot {
	public static void main(String [] a) {
		int [] arr = {10,20,30,40,50};
		boolean b = true;
		for(int i=0;i<arr.length;i++) {
			if(i!= arr.length-1 && arr[i] > arr[i+1]) {
				b = false;
				break;
			}
		}
		if(b)
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
	}
}
