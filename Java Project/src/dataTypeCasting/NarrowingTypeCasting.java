package dataTypeCasting;

public class NarrowingTypeCasting {

	public static void main(String[] args) {

		double d = 4.55d;
		float f = 12.76f;

		int i = (int) d; // Converting DOUBLE to INT
		int j = (int) f; // Converting FLOAT to INT

		System.out.println("Double value is: " + d); // Prints 4.55
		System.out.println("Double to INT is: " + i); // Prints 4
		System.out.println("Float value is: " + f); // Prints 12.76
		System.out.println("Float to INT is: " + j); // Prints 12
 
	}

}
