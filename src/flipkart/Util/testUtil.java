package flipkart.Util;

public class testUtil {
	public static boolean isTestExecutable(String testname,  Xls_Reader xls){
		//int rowCount = xls.getRowCount("testcaselist");
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
	
	public static Object[][]getData(String testname, Xls_Reader xls){
		
		
		return null;
		
	}

}
















