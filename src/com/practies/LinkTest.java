package com.practies;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	for (int i = 0; i < links.size(); i++)
	{
		//
		if (links.get(i).getText().equals("Gmail"))
		{
			links.get(i).click();
			break;
		}
		
	}
		
	}

}
