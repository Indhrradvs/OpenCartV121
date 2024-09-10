package javaBasics;

public class LocalVarExample {

	String myVar = "I'm a Instance Variable"; // Instance Variable

	public void myMethod() {

		// Local Variable
		String myVar = "I'm local variable sitting inside the method!";
		System.out.println(myVar);

	}

	public static void main(String[] args) {

		// Calling Instance Variable
		LocalVarExample obj = new LocalVarExample();
		System.out.println(obj.myVar); // it will print instance Variable
		
		//Calling Method using Object
		obj.myMethod(); // it will call the method
		
		

	}

}
