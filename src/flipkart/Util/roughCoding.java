package flipkart.Util;

import java.io.File;
import java.io.FileInputStream;

public class roughCoding {


	public static void main(String[] args) {
		 Xls_Reader xls = new Xls_Reader("C:\\Users\\Laghuta\\workspace\\Flipkart\\TestCaseSheet.xlsx");
		isTestExecutable("logintest",xls);
		
		
		

	}
	public static boolean isTestExecutable(String testname,  Xls_Reader xls){
		int rowCount = xls.getRowCount("testcaselist");
		//the name of the testcase passed is equal to the data in xls TCID col then check the runmode
		for(int rNum=2 ;rNum<xls.getRowCount("testcaselist");rNum++){
		if(testname.equals(xls.getCellData("testcaselist", "TCID", rNum))){
			if(xls.getCellData("testcaselist", "RunMode", rNum).equals("Y"))
				return true;
				else
				return false;
		}
	}
		return false;
	}

}
