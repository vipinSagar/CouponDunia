package in.couponDunia.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_support {
	
	public static WebDriver driver ;
	
	
	public static void initilalse_browser(String url)
	{
		String path ="C:\\Users\\CouponDunia\\Desktop\\vipin\\MyGit\\AutomationFramework-v1.0\\couponDunia_test\\Lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(url);
	}

}