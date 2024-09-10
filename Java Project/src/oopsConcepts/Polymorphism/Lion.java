package oopsConcepts.Polymorphism;

import oopsConcepts.Abstraction.Cat;

public class Lion extends Cat{
	
	public void animalSound() {
		
		System.out.println("Roarrrr...!");
	}
	
	public static void main(String args[]) {
		
		Cat obj = new Lion(); //Upcasting: Parent class (CAT) ref variable refers child class(Lion)object
		 
		obj.animalSound();
	}

}
