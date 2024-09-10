package dataTypeCasting;

public class WideningTypeCasting {

	public static void main(String[] args) {

		int i = 1100;
		float f = 234.58f;

		long l = i; // Implicit casting: Int to Long
		double d = f; // Implicit casting: float to double

		System.out.println("int value is: " + i); // Prints 1100
		System.out.println("int to long is: " + l);// Prints 1100
		System.out.println("float value is: " + f);// Prints 234.58
		System.out.println("float to double is: " + d);// Prints 234.5800018310547

	}

}
