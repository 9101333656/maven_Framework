
package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {
	
public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\Users\\ridip.malakar\\Documents\\selenium\\meavenPro\\seleniumFrameworkPractice\\src\\test\\resources\\configFiles\\config.properties");
		Properties p=new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
 
	}

}
