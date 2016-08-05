import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readingExcelandStoringinArray {
	
	static WebDriver driver = new FirefoxDriver();
		@Test(dataProvider="data")
		public void verifyLogin(String username, String password) throws InterruptedException{
			 //driver = new FirefoxDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.id("login1")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(5000L);
		 
		}
	   
	@DataProvider(name="data")
	public static Object[][] getdata(){
		Object[][] val = getvalue_1();
		return val;
		
		
		
		/* for(int i=0;i<4;i++){
			 for(int j=0;j<2;j++){
				 System.out.print(val[i][j]);
				 
			 }
			 System.out.print("\n");
			 
			 
		 }*/
		
	}

	  @Test
	   public static Object[][] getvalue_1() {
	       XSSFRow row;
	       XSSFCell cell;
	       String[][] value = null;
	       

	       try {
	           FileInputStream inputStream = new FileInputStream("D://write.xlsx");
	           XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

	           // get sheet number
	           int sheetCn = workbook.getNumberOfSheets();
	           System.out.println(sheetCn);

	           for (int cn = 0; cn < sheetCn; cn++) {

	               // get 0th sheet data
	               XSSFSheet sheet = workbook.getSheet("writesheet");
	               	System.out.println(sheet.getSheetName());
	               // get number of rows from sheet
	               int rows = sheet.getPhysicalNumberOfRows();
	               System.out.println(rows+"no of rows");

	               // get number of cell from row
	               int cells = sheet.getRow(cn).getPhysicalNumberOfCells();
	               System.out.println(cells +" no of cells");

	               value = new String[rows][cells];

	               for (int r = 0; r < rows; r++) {
	                   row = sheet.getRow(r); // bring row
	                   if (row != null) {
	                       for (int c = 0; c < cells; c++) {
	                           cell = row.getCell(c);
	                          // nums = new double[rows][cells];

	                           if (cell != null) {

	                               switch (cell.getCellType()) {

	                               case XSSFCell.CELL_TYPE_FORMULA:
	                                   value[r][c] = cell.getCellFormula();
	                                   break;

	                               case XSSFCell.CELL_TYPE_NUMERIC:
	                                   value[r][c] = ""
	                                        + cell.getNumericCellValue();
	                                   break;

	                               case XSSFCell.CELL_TYPE_STRING:
	                                   value[r][c] = ""
	                                        + cell.getStringCellValue();
	                                   break;

	                               case XSSFCell.CELL_TYPE_BLANK:
	                                  value[r][c] = "[BLANK]";
	                                  break;

	                               case XSSFCell.CELL_TYPE_ERROR:
	                                  value[r][c] = ""+cell.getErrorCellValue();
	                                break;
	                            default:
	                            }
	                           // System.out.print(value[r][c]);

	                        } else {
	                            //System.out.print("[null]\t");
	                        }
	                    } // for(c)
	                    //System.out.print("\n");
	                }
	            } // for(r)
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return value;
	  }
	}
