import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   
		   driver.navigate().to("https://www.google.co.in/");
		   
		   //Clicking on Business Link on  left
		   driver.findElement(By.linkText("Business")).click();
		   
		   Thread.sleep(1000);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(1000);
		   
		   driver.navigate().forward();
		   
		   Thread.sleep(1000);
		   
		   driver.navigate().back();

	}

}
