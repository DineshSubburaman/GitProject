package org.tcs;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\Pictures\\dri\\chromedriver.exe");
		File file=new File("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet createSheet = workbook.createSheet("AMAZON");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphone",Keys.ENTER);
	List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (int i = 0; i < products.size(); i++) {
		String text = products.get(i).getText();
		Row createRow = createSheet.createRow(i);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(text);
	}
	FileOutputStream stream=new FileOutputStream (file);
	workbook.write(stream);
}
}