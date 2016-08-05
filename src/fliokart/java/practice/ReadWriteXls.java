package fliokart.java.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.testng.annotations.Test;

public class ReadWriteXls {
	FileInputStream fis =null;
	FileOutputStream fos = null;
	File file = null;
	public ReadWriteXls() {
		try{
		 file = new File("D://readwrite.xlsx");
		 fis = new FileInputStream(file);
		 
		}catch(Exception e ){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	org.apache.poi.xssf.usermodel.XSSFWorkbook wb =null;
	org.apache.poi.xssf.usermodel.XSSFSheet sheet = null; 
	Row row = null;
	XSSFCell cell = null;
	
	@Test
	public void Readingxls(){
		
		try {
			wb = new org.apache.poi.xssf.usermodel.XSSFWorkbook(fis);
			sheet = wb.getSheet("readwrite");
			System.out.println(sheet.getSheetName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//every sheet has rows, iterate over them
		Iterator rowitr = sheet.rowIterator();
		while(rowitr.hasNext())
			////Get the row object
			row = (Row) rowitr.next();
		//Every row has columns, get the column iterator and iterate over them
		Iterator colitr = row.cellIterator();
			while(colitr.hasNext()){
				////Get the Cell object
				cell = (XSSFCell) colitr.next();
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					if(DateUtil.isCellDateFormatted(cell))
						System.out.println(cell.getDateCellValue());
						
					else
						System.out.println(cell.getNumericCellValue());
						break;
				case Cell.CELL_TYPE_FORMULA:
						System.out.println(cell.getNumericCellValue());
						break;
				case Cell.CELL_TYPE_BLANK:
						System.out.println("Blank");
						break;
				}
				//System.out.println(cell.getStringCellValue());
			/*	
				if(cell.getCellType()== cell.CELL_TYPE_NUMERIC){
					if(DateUtil.isCellDateFormatted(cell))
					System.out.println(cell.getDateCellValue());
					else
					System.out.println(cell.getNumericCellValue());
				}
				else if(cell.getCellType()== cell.CELL_TYPE_STRING)
					System.out.println(cell.getStringCellValue());
				else if(cell.getCellType()== cell.CELL_TYPE_BLANK)
					System.out.println(" Blank");
				else if(cell.getCachedFormulaResultType() == cell.CELL_TYPE_NUMERIC )
					System.out.println(cell.getNumericCellValue());
				else 
					System.out.println("End");*/
					
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		
	@Test	
	public void writexls() throws IOException{
		
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("writesheet");
		for(int r=0;r<3;r++){
			row = sheet.createRow(r);
			for(int c=0; c<=3;){
				cell = (XSSFCell) row.createCell(c);
				cell.setCellValue(c+"B");
				c++;
			}
			
		}
		fos = new FileOutputStream("D://write.xlsx");
		
		wb.write(fos);
		fos.close();
		
		
	}
	
	
		
	}
		

	


