package javaBasics;

public class InstanceVarExample {

	String myInstanceVar = " I'm a Instance Variable "; //Instance Variable
	
	public static void main(String[] args) {
		
		InstanceVarExample obj1 = new InstanceVarExample();
		InstanceVarExample obj2 = new InstanceVarExample();
		InstanceVarExample obj3 = new InstanceVarExample();
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);
		
		System.out.println("---------------------");
		
		//Now I'm changing value for Obj2
		
		obj2.myInstanceVar = " Changed text";
		
		System.out.println(obj1.myInstanceVar);
		System.out.println(obj2.myInstanceVar); // Only Obj2 will be changed to new Value
		System.out.println(obj3.myInstanceVar);
		
		
	}

}
