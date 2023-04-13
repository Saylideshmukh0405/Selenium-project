import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnCheckBox_RadioButton_DemoGuru {
	
	 /*3.https://demo.guru99.com/test/radio.html:	
		 1.Count number of Radio Buttons.Print values from radio 							
		 Buttons and Select one radio button
		2.Count number of CheckBoxes.Print values from all 					cc			
			checkBox and Select all check Boxes.
*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://demo.guru99.com/test/radio.html");
		   
		   List<WebElement> radio_button=driver.findElements(By.xpath("//input[@type='radio']"));
		   
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
		   
		   radio_button.get(1).click();
		   
		   Thread.sleep(1000);
		   System.out.println(radio_button.get(0).getAttribute("checked"));
		   
		   
		   List<WebElement> check_box=driver.findElements(By.xpath("//input[@type='checkbox']"));
		   System.out.println("No of checkbox: "+check_box.size());

		   System.out.println(check_box.get(1).getAttribute("value"));

		   for(int i=0;i<check_box.size();i++)
		   {System.out.println(check_box.get(i).getAttribute("value"));}

		   //Checking whether checkbox is checked or not

		   System.out.println(check_box.get(0).getAttribute("checked"));
		   check_box.get(2).click();
		   System.out.println(check_box.get(0).getAttribute("checked"));
		   

	}

}
