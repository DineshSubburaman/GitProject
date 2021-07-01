package org.pom;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;


public class ProjectObject extends BaseClass
{
public static void main(String[] args) {
	BaseClass baseclass=new BaseClass();
	baseclass.getDriver();
	baseclass.launchUrl("https://adactinhotelapp.com/");
	LoginPage page=new LoginPage();
	WebElement txtUserName = page.getTxtUserName();
	baseclass.typeButton(txtUserName, "Dinesh");
	//after refresh also we can enter alter values
	driver.navigate().refresh();
	baseclass.typeButton(txtUserName, "Kumar");
	WebElement txtPass = page.getTxtPass();
	baseclass.typeButton(txtPass,"123");
	WebElement btnLogin = page.getBtnLogin();
	baseclass.click(btnLogin);		
}
}
