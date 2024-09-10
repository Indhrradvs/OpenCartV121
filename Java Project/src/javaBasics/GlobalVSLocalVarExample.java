package javaBasics;

public class GlobalVSLocalVarExample {

	private int myGlobalVariable = 100;

	public void myMethod() {

		int myLocalVar = 100;

		myLocalVar++; // Local variable increment
		myGlobalVariable++; // global variable increment

		System.out.println("Global Variable: " + myGlobalVariable);
		System.out.println("Local Variable: " + myLocalVar);
	}

	public static void main(String[] args) {

		GlobalVSLocalVarExample obj = new GlobalVSLocalVarExample();

		obj.myMethod(); // Output: Global variable: 101 Local variable: 101
		obj.myMethod(); // Output: Global variable: 102 Local variable: 101
		obj.myMethod(); // Output: Global variable: 103 Local variable: 101
		obj.myMethod(); // Output: Global variable: 104 Local variable: 101

	}

}
