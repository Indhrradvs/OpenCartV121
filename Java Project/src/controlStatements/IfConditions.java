package controlStatements;

public class IfConditions {

	public static void main(String[] args) {

		int a = 50;

		// If condition
		if (a > 10) {

			System.out.println("A is greater than 50");
		}

		// Nested-If condition

		if (a == 50) {

			System.out.println("A is Equals to 50");

			if (a > 40) {

				System.out.println("A is Greater than 40");

			}
		}

		// If-else Condition
		if (a < 10) {

			System.out.println("A is greater than 50");
		}

		else {
			System.out.println("A is Lessthan 50");
		}

		// If-else-If

		int b = 100;

		if (b > 100 && b < 1000) {

			System.out.println(" Condtion-01 is Executed ");
		} 
		
		else if (b < 1 || b > 100) {

			System.out.println(" Condtion-02 is Executed ");
		}

		else if (b > 70 && b == 80) {

			System.out.println(" Condtion-03 is Executed ");
		}
		
		else if(b==100) {
			System.out.println(" Condtion-04 is Executed ");
		}
	}

}
