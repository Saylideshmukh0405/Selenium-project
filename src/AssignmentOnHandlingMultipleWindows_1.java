import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnHandlingMultipleWindows_1 {
	
	/*1.http://the-internet.herokuapp.com/
		1.Click on 'Multiple windows'
		2.Click on 'Click Here'*/
		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.navigate().to("http://the-internet.herokuapp.com/");
		   
		   //Clicking on'Multiple Windows' link on(Bottom side)
		   driver.findElement(By.linkText("Multiple Windows")).click();
		   
		   System.out.println("Title of Parent Window :"+driver.getTitle());
		   
		   System.out.println("After new tab or child window is opened");
		   
		   //Clicking on Click Here button.
		   
		   driver.findElement(By.linkText("Click Here")).click();
		   
		   
           Set<String> ids=driver.getWindowHandles();
		   
		   Iterator<String> iterate=ids.iterator();
		   
		   String parentid=iterate.next();
		   String childid=iterate.next();
          
		   System.out.println("Id of parent Window: "+parentid);
		   System.out.println("Id of child Window: "+childid);
		   
		   driver.switchTo().window(childid);
		   
		   System.out.println("Title of child Window :"+driver.getTitle());
		   
           Thread.sleep(3000);
		   
		   driver.close();
		   
           driver.switchTo().window(parentid);
		   
		   Thread.sleep(3000);          
		   
		   driver.close(); 
		   
		   
		   
		   
		   
		   
		   
	}

}
