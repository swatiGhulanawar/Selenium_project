package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl()); //url of the currently opened web page
		System.out.println(driver.getTitle()); //title of the currently opened web page
		driver.navigate().back(); //used to click on back arrow on the browser
		driver.navigate().forward(); //used to click on the forward arrow on the browser
		Thread.sleep(5000); //this will wait for 5 sec
		driver.navigate().refresh(); // used to click on refresh arrow		
		driver.close();		//closes the currently opened web browser
		
	}

}

