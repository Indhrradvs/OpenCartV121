package oopsConcepts.Abstraction;

public class Duck extends Animal {

	public void animalSound(){
	
		System.out.println("Quack...Quack..!");
		
	} 
	
	
	public static void main(String[] args) {
		
		
		 Animal obj1 = new Duck();
		 
		 obj1.animalSound();
		
	}

}
