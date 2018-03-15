

package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest
{

	public static void main(String[] args)
	{
		//launching Firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to URL
		driver.navigate().to("Http://Yahoo.com");
		//maximize Window
		driver.manage().window().maximize();
		//identify Search field with id property and enter "selenium" by using sendkeys
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		//identify Search Button  with id property and perform click 
		driver.findElement(By.id("uh-search-button")).click();

	}

}
