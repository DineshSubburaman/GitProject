package org.base;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchUrl(String data) 
	{
	driver.get(data);
}
	public void typeButton(WebElement element,String data)
	{
	element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public String getDataFromExcel(String pathname,String name,int rowNo,int CellNo) throws Exception 
	{
			File file=new File(pathname);
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet=workbook.getSheet(name);
			   Row row=sheet.getRow(rowNo);
				Cell cell=row.getCell(CellNo);
				int cellType = cell.getCellType();
				String value="";
				if(cellType==1)
				{
					value = cell.getStringCellValue();
				}else if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormate=new SimpleDateFormat("dd-MM-YYYY");
					value= dateFormate.format(dateCellValue);
					}
				else{
					double numericCellValue = cell.getNumericCellValue();
					long l=(long) numericCellValue;
					value=String.valueOf(l);
					}
				return value;
	}
}
