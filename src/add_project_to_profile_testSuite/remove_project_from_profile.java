package add_project_to_profile_testSuite;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class remove_project_from_profile {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=update_project_to_profile.driver;
		      
		      //click on my profile 
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/label/a/span/span[3]")).click();
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/div/ul/li[2]/a")).click();
		      
		      //click on edit in project panel
		      driver.findElement(By.xpath("//*[@id=\"projectsHolder\"]/div/div[1]/div[1]/div/a/i")).click();
		      
		      // click on delete project
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div/div/div/div/div/div/div[11]/div/div/a")).click();
		      
		      // click on yes 
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[5]/div/div/footer/div[2]/div")).click();
		      
		      TimeUnit.SECONDS.sleep(3); // stop the testing for 3 seconds until the page is refreshed 
		      
		      // check if the project is deleted or not 
		      if(driver.findElement(By.xpath("//*[@id=\"projectsHolder\"]/div/div[1]/div")).isDisplayed())
		      {
		    	  System.out.println("not displayed");
		    	  
		    	  
		      }else {System.out.println("still displayed");}
		      
		      
		      
}
}