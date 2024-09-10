package oopsConcepts.Encapsulation;

public class EncapsulationExample extends EmployeeCount {

	public static void main(String[] args) {
		
		/* Below statement called UPCASTING.Which means parent class ref variable refers object of a child class 
		 * 
		 * EmployeeCount obj: parent class ref variable
		 * new EncapsulationExample(): Object of Child class
		 * 
		 */
		
		
		EmployeeCount obj = new EncapsulationExample(); 
		
		obj.setNumOfEmployees(5870); //assigning value to the Set method in EmployeeCount class

		System.out.println("No.of Employees: "+obj.getNumOfEmployees()); //Calling Get Method
		
	}

}
