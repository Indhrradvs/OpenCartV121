package oopsConcepts.Encapsulation;

public class EmployeeCount {

	private int numOfEmployees = 0; //We can't access this instance variable outside of the class
	
	
	// Creating Set & Get Methods
	
	public void setNumOfEmployees(int count){
		
		numOfEmployees = count;
				
		
	}
	
	public int getNumOfEmployees(){
		
		return numOfEmployees;
	}
	

}
