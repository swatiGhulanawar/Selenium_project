package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAndFramesHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[contains(text(),'Demos')]")).click();
		driver.navigate().back();
		
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement drage =driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));		
				
		action.dragAndDrop(drage, drop).build().perform(); 

	}

}

//build() method in Actions class is use to create chain of action or operation you want to perform. 
//perform() this method in Actions Class is use to execute chain of action which are
