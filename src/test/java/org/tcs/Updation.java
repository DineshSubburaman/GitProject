package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updation {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet=workbook.getSheet("Sheet2");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(1);
		String string=cell.getStringCellValue();
		System.out.println(string);
		if(string.equals("kumar"))
		{
		cell.setCellValue("Sandy");
}
		FileOutputStream stream=new FileOutputStream (file);
		workbook.write(stream);
		
}
}