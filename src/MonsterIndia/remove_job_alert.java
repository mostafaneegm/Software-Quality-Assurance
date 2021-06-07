package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class remove_job_alert {

public static void main(String[] args) throws InterruptedException {
	
		
	  //You must download chromedriver.exe for ChromeDriver to work properly
	// System Property for Chrome Driver 
    System.setProperty("webdriver.chrome.driver","E:\\School\\year 4\\semester2\\quality assurance\\project\\phase 2\\code\\selenium driver\\code\\\\chromedriver.exe");  
	          
	     // Instantiate a ChromeDriver class to establish a connection         
	        WebDriver driver=new ChromeDriver(); 
			
	      //Launch Website
	        //Maximize the Browser
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.navigate().to("https://www.monsterindia.com/");
	       driver.manage().window().maximize();
	       
	       
	       //log in process
		      // click on login
		      driver.findElement(By.xpath("//*[@id=\"seekerLoginBtn\"]/a/span[2]")).click();
		      
		      //enter username 
		      driver.findElement(By.xpath("//*[@id=\"signInName\"]")).sendKeys("mostafanegm153@gmail.com");
		      
		    //enter password
		      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mostafa1996");
		      
		      //click on login 
		      driver.findElement(By.xpath("//*[@id=\"signInbtn\"]")).click();
		      TimeUnit.SECONDS.sleep(10); 
		      
		      
		      
		      
		      
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
