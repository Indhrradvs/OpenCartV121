package loopsDemo;

public class ContinueStatement {

	public static void main(String[] args) {
	
		for(int i=1;i<=10;i++){
			
			if(i==4) { // 4th iteration is skipped because of "continue"
				
				continue; 
			}
			
			System.out.print(i+" ");
		}
	}

}
