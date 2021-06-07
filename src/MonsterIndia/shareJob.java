package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shareJob {


public static void main(String[] args) throws InterruptedException {
	
		
		// Chrome Driver system property and driver location   
    System.setProperty("webdriver.chrome.driver","E:\\School\\year 4\\semester2\\quality assurance\\project\\phase 2\\code\\selenium driver\\code\\\\chromedriver.exe");  
	          
	    //  establish a connection between webdriver and chromdirver       
	        WebDriver driver=new ChromeDriver(); 
			
	   // open website with maximize window
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.navigate().to("https://www.monsterindia.com/");
	       driver.manage().window().maximize();
	       
	       
	    // first i need to log in 
		      // click on login
		      driver.findElement(By.xpath("//*[@id=\"seekerLoginBtn\"]/a/span[2]")).click();
		      
		      //click on username and write username 
		      driver.findElement(By.xpath("//*[@id=\"signInName\"]")).sendKeys("tooty.amicii@gmail.com");
		      
		      // click on password and write password
		      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tooty1234");
		      
		      //click on login 
		      driver.findElement(By.xpath("//*[@id=\"signInbtn\"]")).click();
		      TimeUnit.SECONDS.sleep(10); // make the test sleep for 10 seconds until i log in 
		      //////////////////////////////
		      
		      //click on dashboard
		      driver.findElement(By.xpath("/html/body/div[1]/header/header/div/div[3]/div/div/nav/div[2]/ul[2]/li[2]/a/span[1]")).click();
		      
		      //click on share job by mail
		      
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/span[2]/span/div/a[4]/i")).click();
		      
		      
		      // write user mail that wants to share job with
		      driver.findElement(By.xpath("//*[@id=\"modalDescription\"]/div/div/form/div[2]/div/div/div/input")).sendKeys("mariaamashraf@yahoo.com");
		      
		      
		      // write the message that wants to be send
		      driver.findElement(By.xpath("//*[@id=\"modalDescription\"]/div/div/form/div[4]/div/div/div/input")).sendKeys("this is recommended job");
		      
		      // click on send 
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/span[2]/div/div/div/div/div/div/form/div[5]/div/div/button")).click();
		      
		      if(driver.findElement(By.xpath("//*[@id=\"user-dashboard-right\"]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/span[2]/div/div/div")).isDisplayed())
		      { }

		      
		      
		      
}
}