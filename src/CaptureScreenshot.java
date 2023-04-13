import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException, MessagingException {
		
		
		/*
		 * Taking Screenshot in Selenium is a 3 Step process

		 Step 1) Convert web driver object to TakeScreenshot

		 		TakesScreenshot scrShot =((TakesScreenshot)webdriver);

		 Step 2) Call getScreenshotAs method to create image file

		 		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		 Step 3) Copy file to Desired Location
		
		*/
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.manage().window().maximize();
		   
		   SendMailUsingAuthentication mail=new SendMailUsingAuthentication();
		   
		// Initial Code for capturing screenshot
			//File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(scrFile, new File("C:\\Screenshot Selenium\\screenshot1.jpg"));//Import common jars.
		   
		   
		   //Capture screenshot in case of an error
		   
		   
		   try
		   {
			   
			   
			   driver.findElement(By.name("email")).sendKeys("saylideshpande1991@gmail.com");
			   
			   //driver.findElement(By.name("email1")).sendKeys("saylideshpande1991@gmail.com");
			   
			   driver.findElement(By.name("pass1")).sendKeys("abcd");
			   
			   
		   }
		   
		   catch(Throwable t){
			   
			   
			   File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("C:\\Screenshot Selenium\\errorscreenshot2.jpg"));
				
				mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt, SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.emailFromAddress);
			}
			
			   
			   
		   

	}

}
