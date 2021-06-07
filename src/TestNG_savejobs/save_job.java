package TestNG_savejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class save_job extends login {
  @Test
  public void f() throws InterruptedException {
	  String unexpected = " ";
	  //Click on dashboard
      driver.findElement(By.xpath("//*[@id=\"dashboardBtn\"]/a/span[1]\r\n")).click();
      
      //Click on star to save the job
      driver.findElement(By.xpath("//*[@id=\"user-dashboard-right\"]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/span[1]\r\n")).click();
      
      
      TimeUnit.SECONDS.sleep(3);
      
     
     //find that the notification is displayed after saving a job
     if( driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[5]/div/div/p")).isDisplayed()) 
     {
  	   
  	   System.out.println("displayed");
  	   
  	   //Click on saved jobs
         driver.findElement(By.xpath("//*[@id=\"navId\"]/li[3]/span")).click();
         
         TimeUnit.SECONDS.sleep(3);

         //compare the number of jobs inside the list with the unexpected result
         String result = driver.findElement(By.xpath("//*[@id=\"user-dashboard-right\"]/div[2]/div/div/div/h3")).getText();
         
         if(unexpected.equals(result)) {
      	   
      	   System.out.println("No saved jobs");

         }else {System.out.println(result);
}

     }else {System.out.println("not displayed");} 
     
     
	  
  }
}
