package org.tcs;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng extends BaseClass {
@BeforeClass
private void beforeClass() {
	BaseClass baseClass=new BaseClass();
	baseClass.getDriver();
	baseClass.launchUrl("https://adactinhotelapp.com/");
}
@Parameters({"Username","Password"})
@Test
private void tc0(String s,String s1) {
BaseClass baseClass=new BaseClass();
LoginPage page=new LoginPage();
WebElement txtUserName = page.getTxtUserName();
baseClass.typeButton(txtUserName, s);
WebElement txtPass = page.getTxtPass();
baseClass.typeButton(txtPass, s1);
}
@Test
private void tc1() {
	BaseClass baseClass=new BaseClass();
		LoginPage page=new LoginPage();
		WebElement btnLogin = page.getBtnLogin();
		baseClass.click(btnLogin);
}
@AfterClass
private void afterClass() {
	//driver.close();
}
}