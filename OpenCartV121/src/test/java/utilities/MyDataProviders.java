package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class MyDataProviders {

	//Data Provider-1
	
	@DataProvider(name="LoginData") /* Name should be different from one Data Provider to another*/
	public String[][] getData() throws IOException {

		String path = ".//testData//Opencart_LoginData.xlsx"; // Taking Excel file from testData folder

		// Creating Object for MyExcelUtility class & using those Methods
		MyExcelUtility xlutil = new MyExcelUtility(path); 
		int totalRows = xlutil.getRowCount("sheet1");
		int totalCols = xlutil.getCellCount("sheet1", 1);

		String logindata[][] = new String[totalRows][totalCols];// created 2-dimensional Array which can store

		//In Excel "0" means it's header part. Because of that we started from 1st row. i.e i=1;
		for (int i = 1; i <= totalRows; i++) { // 1 //Read the data from excel and storing in 2D Array

			for (int j = 0; j < totalCols; j++) { // 0, i is Rows, j is columns

				logindata[i-1][j] = xlutil.getCellData("sheet1", i, j); // 1,0
				
				/* Reason to take [i-1] is in Array Index starts from 0. initially i=1, so 1-1= 0*/
			}
		}

		return logindata; //Returns 2D Array

	}

	//Data Provider-2: We can add Multiple DataProvider Methods in the same class
	
	//Data Provider-3
}

