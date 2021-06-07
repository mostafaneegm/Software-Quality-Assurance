package MonsterIndia;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_project_to_profile_negativeTesting {

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
		      
		      //click on my profile 
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/label/a/span/span[3]")).click();
		      driver.findElement(By.xpath("//*[@id=\"usrLoggedInUi\"]/div/ul/li[2]/a")).click();
		      
		      //click on add in project panel
		      driver.findElement(By.xpath("//*[@id=\"projectsHolder\"]/div/div[1]/a")).click();
		      
		      //write the project name 
		      driver.findElement(By.xpath("//*[@id=\"pTitle\"]")).sendKeys("sqa");
		      
		    //write the client name 
		      driver.findElement(By.xpath("//*[@id=\"pClient\"]")).sendKeys("maryam");
		      
		    //select finished  
		      driver.findElement(By.xpath("//*[@id=\"modalDescription\"]/div/div/div[3]/div/div[2]/div[2]/span/input")).click();
		      
		     // select starting project year
		      driver.findElement(By.xpath("//*[@id=\"startYearInputHolder\"]/div[1]/div/div[1]/span[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"startYearInputHolder\"]/div[1]/div/div[2]/ul/li[2]/span")).click();

		      // select starting project month
		      driver.findElement(By.xpath("//*[@id=\"startMonthInputHolder\"]/div[1]/div/div[1]/span[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"startMonthInputHolder\"]/div[1]/div/div[2]/ul/li[1]/span")).click();

		      // select end year of the project that is before the start of the project   
		      driver.findElement(By.xpath("//*[@id=\"endYearInputHolder\"]/div[1]/div/div[1]")).click();
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div/div/div/div/div/div/div[5]/div/div[1]/div[1]/div/div[2]/ul/li[3]/span/span")).click();
		     
		      // select end month of the project  that is before the start of the project    
		      driver.findElement(By.xpath("//*[@id=\"endMonthInputHolder\"]/div[1]/div/div[1]")).click();
		      driver.findElement(By.xpath("//*[@id=\"endMonthInputHolder\"]/div[1]/div/div[2]/ul/li[3]/span/span")).click();
		      
		      // write project details
		      driver.findElement(By.xpath("//*[@id=\"pDescription\"]")).sendKeys("sqa");
		      
		      // click on save btn
		      driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div/div/div/div/div/div/div[11]/div/div/button")).click();
		      
		    TimeUnit.SECONDS.sleep(5);
		     String result = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[4]/div/div/p")).getText();
		     String expected = "Start date must be before end date";
		     // check if any errors occured 
		      if (driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[4]/div/div/p")).isDisplayed()&& expected.equals(result))
		      {
		    	  System.out.println("displayed");
		      }else {
		    	  System.out.print("not displayed");
		      }

}
}
