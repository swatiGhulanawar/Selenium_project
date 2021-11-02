package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();	
		
		//syntax of xpath = tagname[@attribute='value]
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");	
		
		//syntax of CSS selector = tagename[attribute='value']
		//(//form[@name='login']//input)[22] parentChild xpath for password
		driver.findElement(By.xpath("(//form[@name='login']//input)[22]")).sendKeys("password123");		
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		
		driver.findElement(By.id("Login")).click();	//normal xpath
		
		//linktext
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot Your Password?")).click();		
		driver.findElement(By.xpath("//input[@name ='cancel']")).click();
		
		//partialLinkText no spaces allowed
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Use Custom")).click();
		
		//parentChild travers syntax=//parenttagName[@attribute='value']//childtagName
		driver.findElement(By.xpath("//div[@id ='mydomainContainer']//input")).sendKeys("typehere");
		
		driver.findElement(By.xpath("//div[@id ='mydomainContainer']//button")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='main-content']//span")).getText().contains("This site can’t be reached"));
		
		driver.findElement(By.xpath("//button[@id='reload-button']")).click();
		driver.navigate().back();
		//driver.close();
	}

}

/*
 * syntax of xpath = tagname[@attribute='value]
 * syntax of CSS selector = tagename[attribute='value']
 * Absolute Xpath --it uses complete path from root element---parent-child
 * Relative xpath--You can simply start by referencing the element you want and go from there.---
 * conatins xpath = tagName[contains(text(),'value')]
 */
