package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemoClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();
	}

}
