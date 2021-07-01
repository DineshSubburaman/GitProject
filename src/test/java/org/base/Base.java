package org.base;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base
{
public static WebDriver driver;
public void getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\Browser\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public void launchUrl(String data) 
{
driver.get(data);
driver.getWindowHandle();
driver.getWindowHandles();
driver.switchTo().frame(data);
//driver.switchTo().frame(element);
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();
driver.switchTo().frame(data);
Alert a=driver.switchTo().alert();
a.accept();
a.dismiss();
}
public void typeButton(WebElement element,String data)
{
element.sendKeys(data);
//element.getText();
//element.getAttribute(data);
}
public void buttonClick(WebElement element,String data) 
{
Actions ac=new Actions(driver);
ac.moveToElement(element).perform();
ac.dragAndDrop(element,element);
ac.contextClick(element).perform();
ac.doubleClick(element).perform();
ac.keyDown(element,Keys.SHIFT).sendKeys(element,"data");
ac.keyUp(element, Keys.SHIFT).build().perform();
}
public void buttonRobot() throws AWTException 
{
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);
r.keyPress(KeyEvent.VK_1);
r.keyRelease(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_UP);
r.keyRelease(KeyEvent.VK_UP);
r.keyPress(KeyEvent.VK_ESCAPE);
r.keyRelease(KeyEvent.VK_ESCAPE);
}
public void TextJava(WebElement element,String data)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','" +data+ "')", element);
	js.executeScript("arguments[0].click()", element);
	js.executeScript("arguments[0].getAttribute('" +data+ "')",element);
}
public void TakeScreenShot(File src,File desc)
{
TakesScreenshot tk=(TakesScreenshot)driver;
src=tk.getScreenshotAs(OutputType.FILE);
}
public void selectBy(WebElement element,int index,String data,String value)
{
Select s=new Select(element);
s.selectByIndex(index);
s.selectByVisibleText(data);
s.selectByValue(value);
s.getOptions();
s.getAllSelectedOptions();
s.getFirstSelectedOption();
s.isMultiple();
s.deselectByIndex(index);
s.deselectByVisibleText(data);
s.deselectByValue(value);
s.deselectAll();
}
public void click(WebElement element) {
	element.click();
}
}

