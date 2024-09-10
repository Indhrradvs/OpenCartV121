package oopsConcepts;

public class WebSiteClass {

	//Instance Variables of Fields
	
	String webName;
	int webAge; 

	//Constructor
	WebSiteClass(String name, int age){
		
		this.webName = name;
		this.webAge = age;
		
	}
	
	public void carHorn() {
		
		System.out.println("Car Honks!!");
		
	}
		
	public static void main(String[] args) {
		
		//Creating Objects
		WebSiteClass obj1 = new WebSiteClass("Learn Java!",5);
		WebSiteClass obj2 = new WebSiteClass("Java for you!", 10);
				

		// Accessing Object Data through reference
		System.out.println(obj1.webName+" "+obj1.webAge);
		System.out.println(obj2.webName+" "+obj2.webAge);
				
			}
			
			
	}

