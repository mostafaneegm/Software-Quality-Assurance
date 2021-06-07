package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart_BuyNow_ {
	//public static WebDriver driver;


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
		//driver=login.driver;

		
		      
		       TimeUnit.SECONDS.sleep(10); // make the test sleep for 10 seconds until i log in 
	    
	   // click on view all in home page in resume service label 
	    driver.findElement(By.xpath("//*[@id=\"isIntersecting\"]/div/h2/a")).click();
	    
	  // click on (starting at USD 49) in buy career services page to add service in cart  
	    driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
	    
	  // click on (Entry level) to select level of the resume that wants to be added to cart  
	    driver.findElement(By.xpath("//*[@id=\"card-384\"]/label/span/input")).click();
	   
	  // click on (Buy now) to added the service in cart  
	    driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[2]/div/div[2]/div[2]/div[2]/div[3]/button")).click();
	   
	  // hold the expected result  
	    String Expected= "1 Items";
	   
	  // result will holds the output result   
	    String result= driver.findElement(By.xpath("//*[@id=\"themeDefault\"]/section[2]/div/div[2]/div[1]/span")).getText();
	  
	  // check if the result we got from the website in result attribute is same of the expected result  
	    if(Expected.equals(result))
        {
            System.out.println("Correct");

        } 
        else {System.out.println("Not Correct");
        }
 
	   

driver.close();
driver.quit();

}
	



}
