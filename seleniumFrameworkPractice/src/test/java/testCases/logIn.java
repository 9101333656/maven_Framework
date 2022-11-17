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

public class logIn extends baseTest {

	@Test
	public void logInModule() throws AWTException, InterruptedException {
		
	
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector(Loc.getProperty("logInTag"))).click();
		driver.findElement(By.cssSelector(Loc.getProperty("LoginUsername"))).sendKeys("ridip");
		driver.findElement(By.cssSelector(Loc.getProperty("loginPassword"))).sendKeys("rj@123");
		driver.findElement(By.cssSelector(Loc.getProperty("logInButton"))).click();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 
		
	}
	}

