package controlStatements;

public class SwitchCaseExample1 {

	public static void main(String[] args) {

		int num = 2;

		switch (num + 1) {

		case 1:

			System.out.println("Case1: Value is: " + num);

			break;

		case 2:

			System.out.println("Case2: Value is: " + num);
		
			break;
		
		case 3:

			System.out.println("Case3: Value is: " + num);
			
			break;
			
		case 4:

			System.out.println("Case4: Value is: " + num);
			
			break;
		
		default:
			System.out.println("Default: Value is: " + num);
		}

	}

}
