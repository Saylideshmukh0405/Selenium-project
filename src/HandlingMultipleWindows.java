import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	//Important for interview
	//Its always asked in interview

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?elo=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		   
              //or write two line of code
		   //driver.get("https://www.google.co.in/");
		   //driver.findElement(By.linkText("sign in"));
		   
		   //Clicking on'Help' link on(Bottom side)
		   driver.findElement(By.linkText("Help")).click();
		   
		   System.out.println("Title of Parent Window :"+driver.getTitle());
		   
		   System.out.println("After new tab or child window is opened");
		   
		   Set<String> ids=driver.getWindowHandles();
		   
		   Iterator<String> iterate=ids.iterator();
		   
		   String parentid=iterate.next();
		   String childid=iterate.next();
		   
		   
		   System.out.println("Id of parent Window: "+parentid);
		   System.out.println("Id of child Window: "+childid);
		   
		   //Shifting focus from parent/main window to child window
		   
		   driver.switchTo().window(childid);
		   System.out.println("Title of child window: "+driver.getTitle());
		   
		   //<span itemprop="title">Google Account</span>
		   
		   //Customized xpath of Google account= //span[@itemprop='title']
		   
		   //Clicking on 'Google account' Which is at top write side window(Below sign in button)
		   
		   driver.findElement(By.xpath("//span[@itemprop='title']")).click();
		   
		   System.out.println("After new subchild window is opened");
		   
		   ids=driver.getWindowHandles();
		   iterate=ids.iterator();
		   
		   iterate.next();
		   iterate.next();
		   String subchild_id=iterate.next();
		   
		   System.out.println("Id of child Window: "+subchild_id);
		   
		 //Shifting focus from child window to subchild window
		   
		   driver.switchTo().window(subchild_id);
		   
		   System.out.println("Title of subchild window: "+driver.getTitle());
		   
		   Thread.sleep(3000);
		   
		   driver.close();
		   
		   driver.switchTo().window(childid);
		   
		   Thread.sleep(3000);          
		   
		   driver.close();
		   
		   driver.switchTo().window(parentid);
		   
		   Thread.sleep(3000);          
		   
		  // driver.close();
		   
		   //or
		   //driver.quit();//where all windows ll be closed in one go.
		   
		   
		   
		   
		   
		   
	}

}
