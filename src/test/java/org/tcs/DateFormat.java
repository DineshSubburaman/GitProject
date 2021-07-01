package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateFormat {
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet=workbook.getSheet("Sheet2");
		//to print all values
	   for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		   Row row=sheet.getRow(i);
		   for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell=row.getCell(j);
			int cellType = cell.getCellType();
			if(cellType==1)
			{
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}else if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormate=new SimpleDateFormat("dd-MM-YYYY");
				String format = dateFormate.format(dateCellValue);
				System.out.println(format);
				}
			else{
				double numericCellValue = cell.getNumericCellValue();
				long l=(long) numericCellValue;
				System.out.println(l);
			}
}
}
}
}