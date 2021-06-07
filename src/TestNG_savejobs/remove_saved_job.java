package TestNG_savejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class remove_saved_job extends login {
  @Test
  public void f() throws InterruptedException {
	  //String unexpected = " ";
      
      //Click on dashboard
      driver.findElement(By.xpath("//*[@id=\"dashboardBtn\"]/a/span[1]\r\n")).click();
      
      //Click on saved jobs
      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[1]/aside/div[2]/ul/li[3]/span")).click();
      
      
      //time to load saved jobs
      TimeUnit.SECONDS.sleep(3);
      
      //read the number of saved jobs before unsaving one
      String readingone = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[1]/aside/div[2]/ul/li[3]/span/span")).getText();
      
      //Click on star to unsave the job
      driver.findElement(By.xpath("//*[@id=\"user-dashboard-right\"]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/span[1]")).click();
      TimeUnit.SECONDS.sleep(2);
      
      
      //check that the unsave notification appeared
      if( driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[5]/div/div/p")).isDisplayed()) 
      {
   	   
      	
      	
   	   System.out.println("job unsaved");
   	   
         //read the number of saved jobs after unsaving one
         String readingtwo = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[1]/aside/div[2]/ul/li[3]/span/span")).getText();
         
         //compare between the two readings
         if(readingone.equals(readingtwo)) 
         {System.out.println("Number of jobs didn't change in css");}else {System.out.println("Jobs reduced successfully");}

   	            	           	   
      }else {System.out.println("not displayed");}

	  
  }
}
