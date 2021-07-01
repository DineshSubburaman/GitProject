package org.tcs;

import org.base.Base;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fjava extends BaseClass
{
	public static void main(String[] args) throws Exception
	{
		BaseClass b=new BaseClass();
		b.getDriver();
		b.launchUrl("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		b.typeButton(txtuser,b.getDataFromExcel("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx","Sheet2", 0, 3));
		WebElement txtPass = driver.findElement(By.id("pass"));
		b.typeButton(txtPass,b.getDataFromExcel("C:\\Users\\DINESH\\eclipse-workspace\\Browser\\Excel\\Book2.xlsx", "Sheet2", 1, 3));
		WebElement btnLogin = driver.findElement(By.id("login"));
		b.click(btnLogin);
		
	}
}                          