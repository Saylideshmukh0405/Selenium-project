import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		  /* driver.get("http://www.html.am/html-codes/forms/html-radio-button-code.cfm");
		   
		   List<WebElement> check_Box=driver.findElements(By.name("fruit"));
		   
		   System.out.println("Number of checkBoxes are :"+check_Box.size());
		   
		   System.out.println(check_Box.get(1).getAttribute("value"));
		   
		 //Print all values from check box
		   for(int i=0;i<check_Box.size();i++)
		   {
			   System.out.println(check_Box.get(i).getAttribute("value"));
		   }

		   //checking weather check box is checked or not
		   
		   System.out.println("--Checking weather check box is checked or not");
		   Thread.sleep(2000);
		   
		   System.out.println(check_Box.get(0).getAttribute("checked"));
		   
		   Thread.sleep(2000);
		   
		  check_Box.get(0).click();
		  
		  System.out.println(check_Box.get(0).getAttribute("checked"));
		   
		   
		   check_Box.get(0).click();
		   
		   System.out.println(check_Box.get(0).getAttribute("checked"));
		   */
		   
		   driver.get("https://www.html.am/html-codes/forms/html-radio-button-code.cfm");
		   
		  
		   driver.manage().window().maximize();



		   List<WebElement> check_box=driver.findElements(By.name("fruit"));
		   Thread.sleep(2000);
		   
		   System.out.println("No of checkbox: "+check_box.size());

		   System.out.println(check_box.get(1).getAttribute("value"));

		   for(int i=0;i<check_box.size();i++)
		   {System.out.println(check_box.get(i).getAttribute("value"));}

		   //Checking whether checkbox is checked or not
		   
		   Thread.sleep(2000);

		   System.out.println(check_box.get(0).getAttribute("checked"));
		   
		   Thread.sleep(2000);
		   check_box.get(0).click();
		   
		   Thread.sleep(2000);
		   System.out.println(check_box.get(0).getAttribute("checked"));
		   

	}

}
