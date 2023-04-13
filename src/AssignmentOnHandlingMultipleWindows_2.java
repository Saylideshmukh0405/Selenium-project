import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnHandlingMultipleWindows_2 {
	/*
	2.https://www.naukri.com/
		1.click on 'Help center'(Position- Bottom)*/

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.navigate().to("https://www.naukri.com/");
		   
		   //Clicking on'Help Center' link on(Bottom side)
		   
		  // <a class="btn" href="/registration/createAccount?othersrcp=22536">Register now</a>
		   
		   driver.findElement(By.xpath("//a[@class='btn']")).click();
		   
		   System.out.println("Title of Parent Window :"+driver.getTitle());
		   
		   System.out.println("After new tab or child window is opened");
		   
           Set<String> ids=driver.getWindowHandles();
		   
		   Iterator<String> iterate=ids.iterator();
		   
		   String parentid=iterate.next();
		   String childid=iterate.next();
          
		   System.out.println("Id of parent Window: "+parentid);
		   System.out.println("Id of child Window: "+childid);
		   
          driver.switchTo().window(childid);
		   
		   System.out.println("Title of child window: "+driver.getTitle());
		   
              Thread.sleep(3000);
		   
		   driver.close();
		   
           driver.switchTo().window(parentid);
		   
		   Thread.sleep(3000);          
		   
		   driver.close(); 
		   
		   
	
	}

}
