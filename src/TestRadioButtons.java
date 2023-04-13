import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.html.am/html-codes/forms/");
		   
		   List<WebElement> radio_button=driver.findElements(By.name("color"));
		   
		   System.out.println("Number of radio Buttons :"+radio_button.size());
		   
		   System.out.println(radio_button.get(1).getAttribute("value"));
		   
		   //Print all values from Radio buttons
		   for(int i=0;i<radio_button.size();i++)
		   {
			   System.out.println(radio_button.get(i).getAttribute("value"));
		   }

		   //checking weather radio button is checked or not
		   
		   System.out.println("--Checking weather radio button is checked or not");
		   Thread.sleep(2000);
		   
		   System.out.println(radio_button.get(0).getAttribute("checked"));
		   
		   Thread.sleep(1000);
		   
		   radio_button.get(0).click();
		   
		   Thread.sleep(1000);
		   System.out.println(radio_button.get(0).getAttribute("checked"));
		   
		   
	}

}
