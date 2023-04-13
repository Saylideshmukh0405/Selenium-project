import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnFacebookSignup_DropDown_RadioButton {
	
	 /* 2.FaceBook SignUp Complete Program:		Click on 'Create New Account'
		1.Enter first Name
		2.Enter Surname
		3.ENter mobile Number or Email Address
		4.Enter Password
		5.Select Date From DropDown
		6.Select One Gender.
		7.Click on Sign Up Button*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.findElement(By.linkText("Create New Account")).click();
		   
		   Thread.sleep(2000);
		   
		   
		   //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true"
				   //placeholder="First name" aria-label="First name" id="u_2_b_qS" tabindex="0">
		   
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sayli");
		   
		   //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" 
				   //aria-required="true" placeholder="" aria-label="Surname" id="u_2_d_Wl">
		   
		   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Deshmukh");
		   
		   //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" 
				   //placeholder="" aria-label="Mobile number or email address" id="u_2_g_nJ">
		   
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7709827571");
		   
		   driver.findElement(By.name("reg_passwd__")).sendKeys("abcd@123");
		   
		   //Drop Down
		   
		   Thread.sleep(2000);
			  
		   Select day=new Select(driver.findElement(By.name("birthday_day")));
		   
		   day.selectByIndex(3);
		   
		   Thread.sleep(2000);
		   
          Select month=new Select(driver.findElement(By.name("birthday_month")));
		   
		   month.selectByIndex(6);
		   
		   Thread.sleep(2000);
		   
         Select year=new Select(driver.findElement(By.name("birthday_year")));
		   
		   year.selectByValue("1991");
		   
		   //Click on radio Button
		   
		   List<WebElement> radio_button=driver.findElements(By.tagName("label"));
		   
		   System.out.println("--Click on Radio Button");
		   
		   
		   radio_button.get(0).click();
		   
		   Thread.sleep(1000);
		   
		   System.out.println(radio_button.get(0).getAttribute("checked"));
		   
		   Thread.sleep(3000);
		   
		   //<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" 
				   //name="websubmit" id="u_2_s_Px">Sign Up</button>
		   
		   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		   
		  
		  
	}

}
