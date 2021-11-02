package DemoPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("openwindow")).click();
		Set<String> setwindows = driver.getWindowHandles(); //it will return parent and child window
		Iterator<String> itwindow=setwindows.iterator();
		String parentwindow = itwindow.next();
		String childwindow = itwindow.next();

		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Swati");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		
		
	}

}
/*get.windowhandle(): This method helps to get the window handle of the current window
get.windowhandles(): This method helps to get the handles of all the windows opened
set: This method helps to set the window handles in the form of a string. set<string> set= driver.get.windowhandles()
switch to: This method helps to switch between the windows
action: This method helps to perform certain actions on the windows*/