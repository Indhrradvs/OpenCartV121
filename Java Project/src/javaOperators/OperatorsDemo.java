package javaOperators;

public class OperatorsDemo {

	public static void main(String[] args) {

		// Arthimetic Operators

		int num1 = 100;
		int num2 = 20;

		System.out.println("num1+num2: " + (num1 + num2));
		System.out.println("num1-num2: " + (num1 - num2));
		System.out.println("num1*num2: " + (num1 * num2));
		System.out.println("num1/num2: " + (num1 / num2)); // Division operator returns QUOTIENT
		System.out.println("num1%num2: " + (num1 % num2)); // Modulo operator returns REMAINDER

		/* Assignment Operators */

		int a = 10, b;

		b = a;
		System.out.println(" = Output: " + b);

		b += a; // b=b+a
		System.out.println("+= Output: " + b);

		b -= a; // b=b-a
		System.out.println("-= Output: " + b);

		b *= a; // b=b*a
		System.out.println("*= Output: " + b);

		b /= a; // b=b/a
		System.out.println("/= Output: " + b);

		b %= a; // b=b%a
		System.out.println("%= Output: " + b);

		/* Unary Operator */

		int numb1 = 100;
		int numb2 = 200;

		// minus(-)unary operator

		int inverseNum = -numb1;
		System.out.println("Opposite of num1: " + inverseNum);

		numb1++; // Increment
		numb2--; // Decrement

		System.out.println("num1++ is: " + numb1);
		System.out.println("num2-- is: " + numb2);

		/* Logical Operators */

		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 && b2: " + (b1 && b2)); // AND operator
		System.out.println("b1 || b2: " + (b1 || b2)); // OR Operator
		System.out.println("!(b1 && b2): " + !(b1 && b2)); // NOT Operator

		/* Relational Operators */

		int v1 = 10;
		int v2 = 50;

		if (v1 != v2) {

			System.out.println("v1 and v2 are not equal");

		} else {

			System.out.println("v1 and v2 are equal");

		}

		// Greater than >

		if (v1 > v2) {

			System.out.println("v1 is greater than v2");

		} else {

			System.out.println("v1 is less than v2");

		}

		// Less than <

		if (v1 < v2) {

			System.out.println("v1 is less than v2");

		} else {

			System.out.println("v1 is greater than v2");

		}
		// Bitwise operators- refer Java Beginners book webpage
		// Ternary Operators
		
		int t1,t2;
		
		t1 = 25;
		
		/* num1 is not equal to 10 that's why
		 * the second value after colon is assigned
		 * to the variable num2
		 */
		
		t2 = (t1 == 10)? 25:10;
		System.out.println( "t2: "+t2);
		
		/* num1 is equal to 25 that's why
		 * the first value is assigned
		 * to the variable num2
		 */
		
		t2 = (t1 == 25) ? 100: 200;
		System.out.println( "t2: "+t2);
		
		// Shift Operator
		
		int s1 = 24;

	    //Left shift
	    System.out.println("s1<<2: "+(s1<<2));

	    //Right shift
	    System.out.println("s1>>2: "+(s1>>2));
		

	}

}
