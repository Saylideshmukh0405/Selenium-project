import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDropDownList_Facebook {

	public static void main(String[] args) throws InterruptedException 
	
	/* 1.FaceBook SignUp:Create New Account
		1.Handle DropDown list(Select Date From DropDown) 
		        and 	Print  all values from DropDown List 
		2.Handle Radio Buttons(Select One Gender)
		        and Print all values from Radio Buttons*/
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.findElement(By.linkText("Create New Account")).click();
		   
		   Thread.sleep(2000);
		  
		   Select day=new Select(driver.findElement(By.name("birthday_day")));
		   
		   day.selectByIndex(0);
		   
		   Thread.sleep(2000);
		   
          Select month=new Select(driver.findElement(By.name("birthday_month")));
		   
		   month.selectByIndex(1);
		   
		   Thread.sleep(2000);
		   
         Select year=new Select(driver.findElement(By.name("birthday_year")));
		   
		   year.selectByValue("2020");
		   
		   //printing value of all days
		   
		   List<WebElement> option=day.getOptions();
		   
			System.out.println("Total Number of values in dropdown list: "+option.size()); 
			
			//Extract all values from dropdown list
			
			for(int i=0;i<option.size();i++){
			
			
			System.out.println(option.get(i).getText());
			
			System.out.println(option.get(i).getAttribute("id"));
			
			}
			//Printing value of months
			
			List<WebElement> option1=month.getOptions();
			   
			System.out.println("Total Number of values in dropdown list: "+option1.size()); 
			
			//Extract all values from dropdown list
			
			for(int i=0;i<option1.size();i++){
			
			
			System.out.println(option1.get(i).getText());
			
			System.out.println(option1.get(i).getAttribute("id"));
			}
			
			
			//Printing Values of year
			List<WebElement> option2=year.getOptions();
			   
			System.out.println("Total Number of values in dropdown list: "+option2.size()); 
			
			//Extract all values from dropdown list
			
			for(int i=0;i<option2.size();i++){
			
			
			System.out.println(option2.get(i).getText());
			
			System.out.println(option2.get(i).getAttribute("id"));
			}
			
			
			
			/*2.Handle Radio Buttons(Select One Gender)
	        and Print all values from Radio Buttons*/
			
			List<WebElement> radio_button=driver.findElements(By.tagName("label"));
			   
			   System.out.println("Number of radio Buttons :"+radio_button.size());
			   
			   //System.out.println(radio_button.get(1).getTagName());
			   
			   System.out.println(radio_button.get(2).getText());
			   
			   
			   for(int i=0;i<radio_button.size();i++)
			   {
				   System.out.println(radio_button.get(i).getText());
			   }
			   
			   //checking weather radio button is checked or not
			   
			   System.out.println("--Checking weather radio button is checked or not");
			   Thread.sleep(2000);
			   
			   System.out.println(radio_button.get(0).getAttribute("checked"));
			   
			   Thread.sleep(3000);
			   
			   radio_button.get(1).click();
			   
			   Thread.sleep(5000);
			   System.out.println(radio_button.get(0).getAttribute("checked"));
			
			
		   
		   
		   
			  
			  
				  

	}
}
