package selday2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//1) Count no links on page
		List <WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("The number of links of home page is: "+elements.size());
		
		//2) Count total number of images
		List <WebElement> imgelements = driver.findElements(By.tagName("img"));
		System.out.println("The number of links of home page is: "+imgelements.size());
		
		//3) Click on Link text
		driver.findElement(By.linkText("14.1-inch Laptop")).click();
		
		//Close the browser
		driver.quit();
		

	}

}
