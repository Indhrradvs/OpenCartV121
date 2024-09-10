package loopsDemo;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) // Outer Loop 

		{
			for (int j = 1; j <= i; j++) { // Inner Loop 

				System.out.print("* "); // this is to move the cursor to new line
			}

			System.out.println(); // to print the next row of the pattern
		}

	}

}
