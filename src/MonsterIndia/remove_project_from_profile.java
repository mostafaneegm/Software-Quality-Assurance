package MonsterIndia;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class remove_project_from_profile {

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