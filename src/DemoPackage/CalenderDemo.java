package DemoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		List <WebElement> date=driver.findElements(By.xpath("//td[@class='day']")); // find elements when we have multiple elements to store
		System.out.println(date.size()); //it will give the count of elements present in the screen
		
		for (int i =0; i<date.size(); i++) //loop will get execute till it get the value of date.size()
		{
			String stringDate = date.get(i).getText(); //i is index value
			if (stringDate.equalsIgnoreCase("26"))
			{				
			date.get(i).click();
			break;
		}
	
	}
  }
}
