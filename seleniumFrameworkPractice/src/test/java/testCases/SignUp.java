package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.baseTest;

public class SignUp extends baseTest{

	


	@Test
	public void signUpModule() throws InterruptedException, AWTException{
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector(Loc.getProperty("signUpTag"))).click();
		driver.findElement(By.cssSelector(Loc.getProperty("signUpUsername"))).sendKeys("ridip");
		driver.findElement(By.cssSelector(Loc.getProperty("signUpPassword"))).sendKeys("rj@123");
		driver.findElement(By.cssSelector(Loc.getProperty("signUpButton"))).click();
		//driver.switchTo().alert().accept();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Close'])[2]")));
		 driver.findElement(By.xpath(Loc.getProperty("SUCloseButton"))).click();
		 driver.quit();
	}
}

