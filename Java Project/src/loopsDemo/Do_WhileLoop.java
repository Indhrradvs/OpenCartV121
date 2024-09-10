package loopsDemo;

public class Do_WhileLoop {

	public static void main(String[] args) {

		/*
		 * int i = 10;
		 * 
		 * do { System.out.println(i); i--; } while (i > 1);
		 */

		int arr[] = {2,15,30,7,9};
		
		int i = 0;  //i starts with 0 as array index starts with 0
		
		do {
			
			System.out.println(arr[i]);
			
			i++;
			
		} while(i<4);
		
	}
}
