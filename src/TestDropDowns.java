import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.wikibooks.org/");
		   
		   //Select value(English lang) from dropdown list
		  // driver.findElement(By.id("searchLanguage")).sendKeys("Polski");
		   
		   Select select=new Select(driver.findElement(By.id("searchLanguage")));
		   
		  // select.selectByVisibleText("Dansk");
		  // select.selectByIndex(9);
		   
		   select.selectByValue("ko");
		   
		  // Total Number of items/values in dropdownlist
		   
		  // First way
		   
		 /*  List<WebElement> option=select.getOptions();
		   
		System.out.println("Total Number of values in dropdown list: "+option.size()); 
		
		//Extract all values from dropdown list
		
		for(int i=0;i<option.size();i++){
		
		
		System.out.println(option.get(i).getText());
		
		System.out.println(option.get(i).getAttribute("lang"));
		
		}*/
		
		//Second Way for handling dropdownlist
		
		/* List<WebElement> option=driver.findElements(By.tagName("option"));
		 
		 System.out.println("Total number of values in Dropdown list: "+option.size());
		 
		 for(int i=0;i<option.size();i++){
				
				
				System.out.println(option.get(i).getText());
				
				System.out.println(option.get(i).getAttribute("lang"));
		 }
		 
		 System.out.println("-----Printing All Links-------");
		 
		 driver.findElement(By.tagName("a"));
		 
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 
		 System.out.println("Total number of links on webpage: "+links.size());
		 
		 for(int i=0;i<links.size();i++){
				
				
				//System.out.println(links.get(i).getText());
				
				System.out.println(links.get(i).getAttribute("href"));//atrribute is href for all 
				//links,you ll able to see
				*/
				//Print Links from bottom block
				
				/*System.out.println("-----Printing Links Bottom block-------");
				
				//*[@id='www-wikibooks-org']/div[8]-Xpath of full block
				
				WebElement block=driver.findElement(By.xpath("//*[@id='www-wikibooks-org']/div[8]"));
				
				List<WebElement> blocklinks=block.findElements(By.tagName("a"));
				
				System.out.println("Total Number of links in Bloack: "+blocklinks.size());
				
				//print Links from bottom block
				
				for(int i=0;i<blocklinks.size();i++)
				{
					
					
					//System.out.println(blocklinks.get(i).getText());
					
					System.out.println(blocklinks.get(i).getAttribute("href"));//atrribute is href for all 
					//links,you ll able to see when you inspect.
				}*/
				
				//Print values from specific Dropdownlist
				
        WebElement dropdown=driver.findElement(By.id("searchLanguage"));
				
				List<WebElement> option=dropdown.findElements(By.tagName("option"));
				
				System.out.println("Total Number of values in dropdown list: "+option.size());
				
				//print values from specific dropdownlist
				
				for(int i=0;i<option.size();i++)
				{
					
					
					//System.out.println(blocklinks.get(i).getText());
					
					System.out.println(option.get(i).getAttribute("lang"));//atrribute is lang/value for all 
					//links,you ll able to see when you inspect.
				}
				
				
				
						
						
				
		
		 
		 
	}

}
