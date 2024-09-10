package interviewProgs;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
		
		System.out.println(reverse.equals(str)); //returns TRUE is condition is true
		

	}

}
