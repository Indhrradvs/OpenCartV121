package oopsConcepts.Abstraction;

public class Cat extends Animal {

	public void animalSound() {
		
		System.out.println("Meow..Meow..!");
	}
	
	public static void main(String[] args) {
		
        
		Animal obj1 = new Cat();
		
		obj1.animalSound();
		
	}

}
