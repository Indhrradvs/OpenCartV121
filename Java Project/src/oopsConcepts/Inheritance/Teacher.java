package oopsConcepts.Inheritance;

public class Teacher {

	// Instance Variables
	String designation = "Teacher";
	String college = "Virginia International University";
	String Location = "Fairfax, Virginia";
	int numbOfStudents = 2347;

	void does() {

		System.out.println("I'm from Teacher class");
	}

	// Below are added for Testing purposes
	void greeting(){
		
		System.out.println("Hey Guys! Welcome to VIU");
	}
	
	public void setDesignation(String position) {
		
		designation = position;
		
	}
	
    public String getDesignation() {
		
		return designation;
		
	}
}
