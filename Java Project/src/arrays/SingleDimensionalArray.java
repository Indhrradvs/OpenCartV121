package arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		String names[] = new String[5]; // Array Declaration
		
		//Array Initialization
		
		names[0] = "Frank";
		names[1] = "Martin";
		names[2] = "John";
		names[3] = "Kane";
		names[4] = "Wilson";
		
		System.out.println("Lenght of the Array is: "+names.length);
		
		//Print array Elements
		
		for(int i=0; i<names.length; i++) {
			
			System.out.println("Name ["+i+"] = "+names[i]);
		}
		
	}

}
