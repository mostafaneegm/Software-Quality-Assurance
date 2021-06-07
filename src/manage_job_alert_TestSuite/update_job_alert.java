package manage_job_alert_TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class update_job_alert {

static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=add_job_alert.driver;
		      
		      
		      
		      // open profile and click on manage job alert
		      driver.findElement(By.xpath("/html/body/div[1]/header/header/div/div[3]/div/div/nav/div[2]/ul[2]/li[4]/div/ul/li[4]/a")).click();
		      // click on edit job alert
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/ul/li[2]/a")).click();
		      TimeUnit.SECONDS.sleep(40); //wait for page to reload
		      
		    
		      //update job alert name
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[7]/div/div/div/input")).sendKeys("developer alert");
		      //click on save 
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[11]/div/div[2]/input")).click();
		      
		      TimeUnit.SECONDS.sleep(40); //wait until the page finish loading
		      
		      //hold the reading reasult we got from the website
		      String reading =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/h3")).getText();
		      
		      // hold the expected result
		      String result="Your Job Alert hello has been updated successfully.";
		      
		      //check if the website result equals the expected result
		      if(result.equals(reading)) {
		    	  System.out.println("the test is correct");
		    	  
		      }else {
		    	  System.out.println("the test is not correct");
		      }
}}
