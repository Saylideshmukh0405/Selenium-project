import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnCheckBox_echo {
	
	/*4.http://www.echoecho.com/htmlforms09.htm
			1.Print values of all checkBoxes
			2.Check all checkBoxes*/


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("http://www.echoecho.com/htmlforms09.htm");
		   
		   //<input type="checkbox" name="option1" value="Milk">
		   
		   List<WebElement> check_box=driver.findElements(By.xpath("//input[starts-with(@name,'option')]"));
		   
		   Thread.sleep(2000);
		   
		   System.out.println("No of checkbox: "+check_box.size());
		   
		   System.out.println(check_box.get(2).getAttribute("value"));
		   
		   //Printing all values from check box
		   
		   for(int i=0;i<check_box.size();i++)
		   {
			   System.out.println(check_box.get(i).getAttribute("value"));
			   }

		   //Checking whether checkbox is checked or not
		   
		   Thread.sleep(2000);

		   System.out.println(check_box.get(2).getAttribute("checked"));
		   
		   Thread.sleep(2000);
		   check_box.get(1).click();
		   
		   Thread.sleep(2000);
		   check_box.get(2).click();//Clicking on last checkbox
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		//Xpaths of Check Boxes:-
		   
 // /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]

 //  /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]		   
// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]
		   
  /*String xp_start="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[";
 String xp_end="]";
	
 
   Thread.sleep(2000);
   
   int count=0;
	for(int i=0;i<check_box.size();i++)
	
	{
		 String x=driver.findElement(By.xpath(xp_start+i+xp_end)).getText();
		 count++;
		 System.out.println(x);
	}
	
	System.out.println("Checkbox count is "+count);
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	}

}
