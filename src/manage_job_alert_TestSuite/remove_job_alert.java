package manage_job_alert_TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class remove_job_alert {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
		      driver=update_job_alert.driver;
		      
		      
		      
		      // open profile and click on manage job alert
		      driver.findElement(By.xpath("/html/body/div[1]/header/header/div/div[3]/div/div/nav/div[2]/ul[2]/li[4]/div/ul/li[4]/a")).click();
		   
		      TimeUnit.SECONDS.sleep(40); //wait for page to reload
		      
		      // click on delete 
		     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[1]/a")).click();
		     // click on yes 
		     driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/footer/div[2]/div")).click();
		     
		     
		      
		     
		      TimeUnit.SECONDS.sleep(10); // sleep until the message occured
		      //check if the deleting notification is displayed or not
		      if(driver.findElement(By.xpath("/html/body/div[2]/div/div[3]")).isDisplayed()) {
		    	  
		    	  System.out.println("the test case is correct");
		    	  
		      }else {System.out.println("test case not correct");}
		      
}
}
