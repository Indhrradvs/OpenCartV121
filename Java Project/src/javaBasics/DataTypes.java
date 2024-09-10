package javaBasics;

public class DataTypes {

	public static void main(String[] args) {

		// Byte: This can hold whole number between -128 and 127
		byte num;
		num = 10;
		System.out.println(num);

		// Short:Its range is -32,768 to 32767.
		short num1;
		num1 = 32766;
		System.out.println(num1);

		// Long: It's range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
		long num2 = -12332252626L;
		System.out.println(num2);

		// Double: Sufficient for holding 15 decimal digits
        double num3 = -42937737.9d;
		System.out.println(num3);

		// Float: Sufficient for holding 6 to 7 decimal digits
		float num4 = 45.76f;
		System.out.println(num4);
		
		// Boolean: It holds either true of false
		boolean b = true; 
		System.out.println(b);
		
		//Char
		char ch ='z';
		System.out.println(ch);
		
	}

}
