package add_project_to_profile_testSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class update_project_to_profile {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	
		driver= Add_project_to_profile.driver;
		
		      
		      //click on my profile 
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/label/a/span/span[3]")).click();
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/div/ul/li[2]/a")).click();
		      
		      //click on edit in project panel
		      driver.findElement(By.xpath("//*[@id=\"projectsHolder\"]/div/div[1]/div[1]/div/a/i")).click();
		      
		      // click on finished radio button
		      driver.findElement(By.xpath("//*[@id=\"modalDescription\"]/div/div/div[3]/div/div[2]/div[2]/label/span")).click();
		      
		      // select end year of the project
		      driver.findElement(By.xpath("//*[@id=\"endYearInputHolder\"]/div[1]/div/div[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"endYearInputHolder\"]/div[1]/div/div[2]/ul/li[1]/span/span")).click();
		     
		      // select end month of the project      
		      driver.findElement(By.xpath("//*[@id=\"endMonthInputHolder\"]/div[1]/div/div[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"endMonthInputHolder\"]/div[1]/div/div[2]/ul/li[3]/span/span")).click();
		      
		      // click on save btn
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div/div/div/div/div/div/div[11]/div/div/button")).click();
		      
		      // stop the testing for 5 seconds until the page is refreshed
		     TimeUnit.SECONDS.sleep(5);
		     
		     // test if the update occurred   
		      String result =driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[4]/div/div/p")).getText();
		       String expected ="Section updated successfully";
		    if( expected.equals(result)) {
		    	 System.out.println("Correct");

	        } 
	        else {System.out.println("Not Correct");
	        }
	      

		    driver.close();
		     driver.quit();






}
	
}
