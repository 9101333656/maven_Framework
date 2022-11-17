package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties Loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	
	
	
	
	
	@BeforeMethod
	
	public void setUp() throws IOException {
		
		if (driver==null) {
			FileReader fr= new FileReader("C:\\Users\\ridip.malakar\\Documents\\selenium\\meavenPro\\seleniumFrameworkPractice\\src\\test\\resources\\configFiles\\config.properties");
			FileReader fr1= new FileReader("C:\\Users\\ridip.malakar\\Documents\\selenium\\meavenPro\\seleniumFrameworkPractice\\src\\test\\resources\\configFiles\\locators");
			prop.load(fr);
			Loc.load(fr1);
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testurl"));
		}
		
		
		
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.close();
	}
}
