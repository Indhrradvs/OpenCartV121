package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
	//	int arr[][] = new int [2][3]; //2 rows and 3 columns
		
	int arr[][] = {{11,12,13},{21,22,23}};  //2 rows and 3 columns
	
	//outer loop 0 till number of rows
	
	for(int i=0;i<2;i++) {
		
		for(int j=0;j<3;j++) {  // Inner Loop 0 till number of columns
			
			System.out.print(arr[i][j]+" ");
		}
		
		System.out.println();
	}
	
		
		
	}

}
