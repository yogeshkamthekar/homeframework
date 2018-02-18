package base;

import base.XLSReader;

public class TestUtil {

	public static Object[][] getData(XLSReader xlsFile , String testName){
		// if the sheet for data exists
		//return data
		int rows=xlsFile.getRowCount(testName)-1;
		if(rows <=0){
			Object[][] testData =new Object[1][0];
			return testData;
			
		}
	    rows = xlsFile.getRowCount(testName);  // 3
		int cols = xlsFile.getColumnCount(testName);
		//TestBase.APP_LOGS.debug("Test Name -- "+testName);
		//TestBase.APP_LOGS.debug("total rows -- "+ rows);
		//TestBase.APP_LOGS.debug("total cols -- "+cols);
		
		Object data[][] = new Object[rows-1][cols];
		
		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=xlsFile.getCellData(testName, colNum, rowNum);
			}
		}
		
		return data;
	}
	
public static boolean isSkip(XLSReader xlsFile, String testName){
		
		for(int rowNum=2 ; rowNum<=xlsFile.getRowCount("Suite_Classes");rowNum++){
			if(testName.equals(xlsFile.getCellData("Suite_Classes", "TCID", rowNum))){
				if(xlsFile.getCellData("Suite_Classes", "RunMode", rowNum).equals("Y"))
					return false;
				else
					return true;
			}
		}
		
		return true;
	}
	
	
	
	
}
