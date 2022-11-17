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

public class makeAnOrder extends baseTest{

	
	@Test
	public void order() throws InterruptedException, AWTException {
	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector(Loc.getProperty("phonesTag"))).click();
		driver.findElement(By.cssSelector(Loc.getProperty("IPhone6Product"))).click();
		driver.findElement(By.cssSelector(Loc.getProperty("addToCartButton"))).click();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(Loc.getProperty("cartTag"))).click();
		 driver.findElement(By.cssSelector(Loc.getProperty("placeOrderBut"))).click();
		 driver.findElement(By.cssSelector(Loc.getProperty("nameField"))).sendKeys("ridip");
		 driver.findElement(By.cssSelector(Loc.getProperty("countryField"))).sendKeys("India");
		 driver.findElement(By.cssSelector(Loc.getProperty("cityField"))).sendKeys("Delhi");
		 driver.findElement(By.cssSelector(Loc.getProperty("craditCardField"))).sendKeys("123456789101");
		 driver.findElement(By.cssSelector(Loc.getProperty("monthField"))).sendKeys("November");
		 driver.findElement(By.cssSelector(Loc.getProperty("yearField"))).sendKeys("2022");
		 driver.findElement(By.cssSelector(Loc.getProperty("purchaseButton"))).click();
		// driver.findElement(By.cssSelector("button.confirm.btn.btn-lg.btn-primary")).click();
		
		

	}
	}

