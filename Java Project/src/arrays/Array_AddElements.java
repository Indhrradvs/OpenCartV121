package arrays;

public class Array_AddElements {

	public static void main(String[] args) {
		
		String fruits[] = new String[] {"Apple","Orange","Grapes"}; //declared and initialized a string array

		 //we want to add two more elements to the fruits array so let's
	    //create a new array with the size of 5
		
		String newFruits[] = new String[fruits.length+2];
		
		//copying elements from old array to new array
		
		for(int i=0; i<fruits.length; i++) {
			
			newFruits[i]= fruits[i];
		}
		
		//Adding New Elements		
	    newFruits[newFruits.length-2] = "Mango";  //second last element
	    newFruits[newFruits.length-1] = "Kiwi";  // last element
	
		
		//Print new Array		
		for(String str: newFruits) {
			System.out.println(str);
		}
		
	}

}
