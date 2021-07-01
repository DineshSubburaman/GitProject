package org.tcs;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;

public class JunitB extends BaseClass
{
static BaseClass baseClass;
LoginPage page;
@BeforeClass
public static void beforeClass() {
	baseClass=new BaseClass();
	baseClass.getDriver();
	baseClass.launchUrl("https://adactinhotelapp.com/");
}
@Test
public void tc0() {
page=new LoginPage();
WebElement txtUserName = page.getTxtUserName();
baseClass.typeButton(txtUserName, "Dinesh");
WebElement txtPass = page.getTxtPass();
baseClass.typeButton(txtPass, "123");
}
@Test
public void tc01() {
WebElement btnLogin = page.getBtnLogin();
baseClass.click(btnLogin);
}
@AfterClass
public static void afterClass() {
driver.close();
}
}
