package add_project_to_profile_testSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Add_project_to_profile {
	
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
		
		
		driver=login.driver;
	  
	       
	       
		      //click on my profile 
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/label/a/span/span[3]")).click();
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/div/ul/li[2]/a")).click();
		      
		      //click on add in project panel
		      driver.findElement(By.xpath("//*[@id=\"projectsHolder\"]/div/div[1]/a")).click();
		      
		      //write the project name 
		      driver.findElement(By.xpath("//*[@id=\"pTitle\"]")).sendKeys("sqa");
		      
		    //write the client name 
		      driver.findElement(By.xpath("//*[@id=\"pClient\"]")).sendKeys("maryam");
		      
		    //select in progress 
		      driver.findElement(By.xpath("//*[@id=\"modalDescription\"]/div/div/div[3]/div/div[2]/div[1]/span/input")).click();

		      // select starting project year
		      driver.findElement(By.xpath("//*[@id=\"startYearInputHolder\"]/div[1]/div/div[1]/span[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"startYearInputHolder\"]/div[1]/div/div[2]/ul/li[2]/span")).click();

		      // select starting project month
		      driver.findElement(By.xpath("//*[@id=\"startMonthInputHolder\"]/div[1]/div/div[1]/span[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"startMonthInputHolder\"]/div[1]/div/div[2]/ul/li[1]/span")).click();

		      // write project details
		      driver.findElement(By.xpath("//*[@id=\"pDescription\"]")).sendKeys("sqa");
		  

		      //click on save
		      

		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div/div/div/div/div/div/div[11]/div/div/button")).click();
		      TimeUnit.SECONDS.sleep(10); // make the test sleep for 10 seconds until i log in 
		    
		     if(driver.findElement(By.xpath("//*[@id=\"projectsHolder\"]/div/div[1]/div")).isDisplayed())   {
		           System.out.println("Correct");

		        } 
		        else {System.out.println("Not Correct");
		        }
		      
		      
		     driver.close();
		     driver.quit();

		      
}}
