package loopsDemo;

public class EnhancedForLoop {

	public static void main(String[] args) {

		int arr[] = { 22, 44, 55, 66 };

		for (int num : arr) {

			System.out.println(num);
		}
		
		System.out.println("------");

		// If its string

		String arr1[] = { "Hi", "Hello", "Bye" };

		for (String str : arr1) {
			
			System.out.println(str);
		}

	}

}
