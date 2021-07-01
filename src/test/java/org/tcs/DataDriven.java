package org.tcs;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws Exception {
	File file=new File("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx");
	FileInputStream fileInputStream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileInputStream);
	Sheet sheet=workbook.getSheet("Sheet2");
	//to print all values
   //for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	 //  Row row=sheet.getRow(i);
	  // for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		//Cell cell=row.getCell(j);
		//String string = cell.getStringCellValue();
		//System.out.println(string);
	//}
		
	//}
	Row row=sheet.getRow(0);
	Cell cell=row.getCell(1);
	String string=cell.getStringCellValue();
	System.out.println(string);
	
	
}
}

