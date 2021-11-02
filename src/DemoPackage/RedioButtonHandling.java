package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedioButtonHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    //every redio button is getting seletected or not
		List <WebElement> redioButton =	driver.findElements(By.xpath("//input[@name= 'radioButton']"));
		System.out.println(redioButton.size());
		for(WebElement redioButtonElement1: redioButton ) {
			redioButtonElement1.click();
		}	
		driver.findElement(By.xpath("//input[@name= 'radioButton']")).click();
		WebElement redioButtonElement2 =driver.findElement(By.xpath("//input[@name= 'radioButton']"));
		System.out.println("is selected: "+redioButtonElement2.isSelected());
		System.out.println("available on screen: "+redioButtonElement2.isDisplayed());
		System.out.println("This is enabled to select: "+redioButtonElement2.isEnabled());
		
		//to select particular redio button		
		List <WebElement> redioButton2 = driver.findElements(By.xpath("//input[@name='radioButton']"));
		for (WebElement redioButtonElement3:redioButton2) {
	
			if (redioButtonElement3.getAttribute("value").equalsIgnoreCase("radio2")) {
			redioButtonElement3.click();	
			break;
		}
		}
	}
}
