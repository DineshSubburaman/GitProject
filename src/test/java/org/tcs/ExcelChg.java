package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelChg {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet createSheet = workbook.createSheet("KING");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(1);
		createCell.setCellValue("San");
		FileOutputStream stream=new FileOutputStream (file);
		workbook.write(stream);
}
}