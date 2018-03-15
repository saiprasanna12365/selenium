
package com.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Google.co.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("gb_P")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
		
	String title=driver.getTitle();//gmail
		//capturing the title
	System.out.println(title);
	//capturing the URL
String url=	driver.getCurrentUrl();
	System.out.println(url);

	}

}
