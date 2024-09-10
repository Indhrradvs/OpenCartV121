package oopsConcepts.Abstraction;

public class Dog extends Animal {

	public void animalSound() {
		
		System.out.println("Woof Woof.!!");
		
	}
	
	public static void main(String[] args) {
		
		Animal obj = new Dog();
		
		obj.animalSound();
		
		
	  }
}
