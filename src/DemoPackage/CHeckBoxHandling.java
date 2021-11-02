package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHeckBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		/*// to select particular check box
		// driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		// to select particular check boxe from multiple checkbox options are avaialable to select
		List<WebElement> chekbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(chekbox.size());

		// for each loop, create object for for loop(element) and pass the stored
		for (WebElement checkBoxElement : chekbox) {
			checkBoxElement.click();
		}
				
		//to select particular check box
		List<WebElement> chekbox1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkBoxElement : chekbox1) {
			System.out.println(checkBoxElement.getAttribute("value")); //this will print only 2values as we have added break at option2 value in if condition
			if (checkBoxElement.getAttribute("value").equalsIgnoreCase("Option2")) {
				checkBoxElement.click();
				break;
			}
			
		}*/
		//to check element is selected/not
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		System.out.println("This is to check it is selected or not: "+checkBox.isSelected());
		System.out.println("This is to check it display on screen or not: "+checkBox.isDisplayed());
		System.out.println("This is to check it is enable or not to select: "+checkBox.isEnabled());
		driver.quit();
		
		//to avoid sysout statement
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();
	
	}
}

