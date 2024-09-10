package loopsDemo;

public class Break_Statement {

	public static void main(String[] args) {
		
		int num = 0;
		
		while(num<=100) {
			
			System.out.println(" Value of the Variable is: "+num);
			
			if(num==5) {
				break;
			}
			
			num++;
		}
		
		System.out.println(" Out of While Loop ");
	}

}
