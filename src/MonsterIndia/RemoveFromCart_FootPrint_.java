package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveFromCart_FootPrint_ {

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
	      
	      
	      //click on cart 
	      driver.findElement(By.xpath("//*[@id=\"header-cart\"]/a")).click();
	  
	      //click on trash icon to delete whats in cart
	      driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[2]/div/div[3]/div/div[1]/div[2]/div[1]/div/div/div/span[2]/i")).click();
	      
	      //click on yes to confirm the deletion of the service in cart
	      driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[2]/div/div[3]/div[2]/div/section/div/div/botton[1]")).click();
	      
	      
	      if(driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[2]/div/div[1]/div/div/div")).isDisplayed())
	      {
	    	  System.out.println("test is correct");
	    	  
	      }else System.out.println("test is not correct");

driver.close();
driver.quit();

}
}
