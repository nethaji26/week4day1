package week4.day1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement table = driver.findElement(By.xpath("//section[@class='innerblock']//table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cols = table.findElements(By.tagName("td"));
		for (WebElement columns : cols) {
			
			System.out.println(" The columns are " + columns.getText());
			
		}
		for (WebElement rowss : rows) {
			
			System.out.println(" The rows are " + rowss.getText());
		}
		
		System.out.println("The rows count is " +rows.size());
		System.out.println(" The columns count is " +cols.size());
		
		
		//Get the progress value of 'Learn to interact with Elements'

		String text = driver.findElement(By.xpath("(//td)[5]")).getText();
		System.out.println(" The progress of Learn to interact with elements" + text);
		boolean vitalenabled = driver.findElement(By.xpath("(//input[@name='vital'])[5]")).isEnabled();
		System.out.println(" The vital value of last element is " + vitalenabled);
		File sourceimage = driver.getScreenshotAs(OutputType.FILE);
		File destimage = new File("./snaps/img001.png");
		FileUtils.copyFile(sourceimage, destimage);
		
		
		
		
		
		
		
	}

}
