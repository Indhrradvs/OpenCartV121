package javaBasics;

public class StaticVarExample {

	public static String myClassVar = "I'm a Static/Class variable" ; // Class or static variable
	
	// IMP: Static Variables can be accessed using the class name rather instance name
	
	public static void main(String[] args) {
		
		StaticVarExample obj1 = new StaticVarExample();
		StaticVarExample obj2 = new StaticVarExample();
		StaticVarExample obj3 = new StaticVarExample();
		
		//All three will display "class or static variable"
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		//changing the value of static variable using obj2
		
		obj2.myClassVar = "Changed Text"; // If we change the value for 1 obj of the class then all the objs will be changed
		
		System.out.println(obj1.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
		
		/* Do note that only static variables can be accessed like this (without using object). 
		 * This doesn’t apply for instance and local variables.
		 */
		
		
	}

}
