package org.tcs;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH\\eclipse-workspace\\Browser\\driver\\chromedriver.exe" );
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com/");
}
}
