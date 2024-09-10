package variableExamples;

public class AsciiValue {

	public static void main(String[] args) {
		
		// Method1: By assigning a character to the int variable
		
		char ch ='H';
		
		int asciiValue = ch;
		
		System.out.println("ASCII Value of "+ch+" is: "+asciiValue);
		

		// Method2: By type casting character value as int
		
		int asciiCode = (int)ch;
		
		System.out.println("ASCII Value of "+ch+" is: "+asciiCode);
		
		
	}

}
