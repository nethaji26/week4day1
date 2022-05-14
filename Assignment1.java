package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.day2.SecondlargestElementArrayList;


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
	 WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']"));
	 List<WebElement> rows = table.findElements(By.tagName("tr"));
	 //List<WebElement> colsu = table.findElements(By.tagName("td"));
	    

	    System.out.println("The rows size is " + rows.size());
	   // System.out.println("The cols size is " + colsu.size());
	   // System.out.println(" The columns size is " + cols.size());
	   List<String>listofvalues = new ArrayList<String>();
	   
	   
	    	
	    	
			
	    for(int i=1;i<rows.size();i++)
	    {
	    	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	    

	            for (int j=2; j<3; j++)
	        	//for (int j=0; j<4; j++)   
	    {
	            System.out.println(" The security names are below " + cols.get(j).getText());
	            //value.add(cols.get(j).getText());
	            String Securitynames = cols.get(j).getText();
	            if(!listofvalues.contains(Securitynames)) {
	            	listofvalues.add(Securitynames);
	            }
	            
	         } 
	       
	            
	        
	}
	    System.out.println("Removed duplicates from the security names :");
	    System.out.println(listofvalues); 
	 
	 
} 
}
	 
	 
	 
	 
	 
	/* System.out.println(rows);
	 
	 for (int i = 1; i < rows.size(); i++) {
         // Cols inside the rows
         List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
     // for (int j = 0; j < cols.size(); j++) 
         for (int j = 0; j < 2; j++) 
         {
             System.out.println(cols.get(j).getText());
        }
     }
*/	 
	 /*for (WebElement webElement : findElements)
	 
	 {
		System.out.println(webElement);
	}
				
				
	 

		WebElement elementTable = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]"));
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		// Iterate the rows to get the data
     for (int i = 1; i < rows.size(); i++) {
         // Cols inside the rows
         List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
     // for (int j = 0; j < cols.size(); j++) 
         for (int j = 0; j < 2; j++) 
         {
             System.out.println(cols.get(j).getText());
        }*/
     
		
		
		
		
		
		
	


