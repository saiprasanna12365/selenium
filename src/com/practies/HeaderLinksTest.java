package com.practies;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://bing.com");
		driver.manage().window().maximize();
		//identify header section by className and stored into a variable
WebElement header=driver.findElement(By.className("sw_tb"));
//capturing links under header section with tagName and stored into a variable
  List<WebElement> headrLinks=header.findElements(By.tagName("a"));
  
  System.out.println(headrLinks.size());
  
  for (int i = 0; i < headrLinks.size(); i++) 
  {
	System.out.println(headrLinks.get(i).getText());
  }

	}

}
