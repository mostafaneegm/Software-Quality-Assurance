package manage_job_alert_TestSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import add_project_to_profile_testSuite.login;

public class add_job_alert {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	driver=login.driver;
		      
		      // open profile and click on manage job alert
		      driver.findElement(By.xpath("/html/body/div[1]/header/header/div/div[3]/div/div/nav/div[2]/ul[2]/li[4]/div/ul/li[4]/a")).click();
		      // click on create job alert
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[1]/div[2]/a")).click();
		      TimeUnit.SECONDS.sleep(40); //wait for page to reload
		      
		      // write keywords
		      driver.findElement(By.xpath("//*[@id=\"jobAlertsThemeDefault\"]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[1]/div/div/div/div/div[1]/input")).sendKeys("IT");
		      // select year of Experience 
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[2]/div/div/div/div/div[2]/ul/li[1]/span/span")).click();
		    // write current location
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[3]/div/div/div/div/div[1]/input")).sendKeys("Egypt");
		      //select preferred industry 
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[4]/div/div[2]/div/div/div[3]/ul/li[2]/span")).click();
		      //select preferred function
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[5]/div/div[2]/div/div/div[3]/ul/li[2]/span/span/span")).click();
		      //select preferred role
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[4]/div/div[2]/div/div/div[3]/ul/li[2]/span")).sendKeys("IT");
		      //write job alert name
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[7]/div/div/div/input")).sendKeys("developer alert");
		      //click on save 
		      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div[2]/div[1]/form/div/div[2]/div/div[11]/div/div[2]/input")).click();
		      
		      TimeUnit.SECONDS.sleep(40); //wait until the page finish loading
		      
		      //hold the reading reasult we got from the website
		      String reading =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div[2]/h3")).getText();
		      
		      // hold the expected result
		      String result="Your Job Alert hello has been created successfully.";
		      
		      //check if the website result equals the expected result
		      if(result.equals(reading)) {
		    	  System.out.println("the test is correct");
		    	  
		      }else {
		    	  System.out.println("the test is not correct");
		      }
}}
