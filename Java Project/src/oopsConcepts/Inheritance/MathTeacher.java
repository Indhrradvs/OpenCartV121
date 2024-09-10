package oopsConcepts.Inheritance;

public class MathTeacher extends Teacher {

	String mainSubject = "Mathematics";
	
	public static void main(String[] args) {
	
		MathTeacher obj = new MathTeacher();
		
		System.out.println(obj.mainSubject);
	
		System.out.println(obj.designation);
		
		System.out.println(obj.college);
		
		System.out.println(obj.Location);
		
		System.out.println(obj.numbOfStudents);
		
		obj.does(); 

		
		// Below are added for Testing purposes
		obj.greeting();
		
		obj.setDesignation("Changed to Mathematics Professor");
		
		System.out.println(obj.getDesignation());
		
        obj.setDesignation("Changed to Head of the Department");
		
		System.out.println(obj.getDesignation()); 
	}

}
