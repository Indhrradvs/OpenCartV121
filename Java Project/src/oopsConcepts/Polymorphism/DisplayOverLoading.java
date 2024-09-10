package oopsConcepts.Polymorphism;

public class DisplayOverLoading {

	/* Method Overloading: This allows us to have more than one methods with same name in a class 
	 * that differs in signature.
	 */
	
	public void disp(char c) {
		
		System.out.println(c);
	}
    public void disp(char c, int num) {
		
		System.out.println(c+" "+num);
	}
	
}
