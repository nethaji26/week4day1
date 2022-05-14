package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement tableelement = driver.findElement(By.xpath("//div[@class='render']//table"));
		 List<WebElement> rows = tableelement.findElements(By.tagName("tr"));
		// for(int i=0;i<rows.size();i++)
		 //there is no tr[0] only tr[] is there for headers, so tr[1] adn tr[2] will print first 2 rows
		 for(int i=0;i<3;i++)
		 {
			 
			 List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			 
			 for(int j=0;j<cols.size();j++)
			//for(int j=1;j<3;j++)
			 {
				 
				 System.out.println(cols.get(j).getText() );
			 }
				 
			
		 }
		
		

	}

}
