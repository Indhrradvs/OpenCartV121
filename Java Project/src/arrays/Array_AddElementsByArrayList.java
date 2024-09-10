package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_AddElementsByArrayList {

	public static void main(String[] args) {
		
		String[] fruits = new String[] {"Apple","Grapes","Strawberry"};
		
		//Convert the array "fruits" to an ArrayList
		
		ArrayList<String> fruitsList = new ArrayList<String>(Arrays.asList(fruits));

		//Adding elements
		
		fruitsList.add("Mango");
		fruitsList.add("Peaches");
		
	   //Convert the ArrayList to array
	
		String[] newFruits = fruitsList.toArray(new String[fruitsList.size()]);
	
		// Print new Array
		
		for(String str : newFruits) {
			
			System.out.println(str);
		}
	}

}
