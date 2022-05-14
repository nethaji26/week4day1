package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table = driver.findElement(By.className("attributes-list"));
	    List<WebElement> rows = driver.findElements(By.tagName("tr"));
	    List<WebElement> cols = driver.findElements(By.tagName("td"));//table data
	    List<WebElement> headers = driver.findElements(By.tagName("th"));//headers originally columns
		System.out.println("The number of rows is " +rows.size());
		System.out.println(" The number of table data is " +cols.size());
		System.out.println(" The number of cols is " +headers.size());
		

	}

}
