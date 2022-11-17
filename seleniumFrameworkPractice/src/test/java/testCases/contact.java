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

public class contact extends baseTest{

	@Test
	public void contactModule() throws InterruptedException, AWTException {
		
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//	driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector(Loc.getProperty("contactTag"))).click();
		driver.findElement(By.cssSelector(Loc.getProperty("contactEmail"))).sendKeys("rj1234@gmail.com");
		driver.findElement(By.cssSelector(Loc.getProperty("contactName"))).sendKeys("ridip");
		driver.findElement(By.cssSelector(Loc.getProperty("CMessage"))).sendKeys("hellooooooooo");
		driver.findElement(By.cssSelector(Loc.getProperty("sendMessageBut"))).click();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		
	
}
	}

