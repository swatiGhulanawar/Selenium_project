package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement dd= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
	//	Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		Select dropdown = new Select(dd);	
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText()); //to print the values selected in dropdown
		
		dropdown.selectByValue("INR");
		Thread.sleep(2000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("USD");		
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
