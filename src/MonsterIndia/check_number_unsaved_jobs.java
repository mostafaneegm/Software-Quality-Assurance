package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_number_unsaved_jobs {
	
	public static void main(String[] args) throws InterruptedException {

		//You must download chromedriver.exe for ChromeDriver to work properly
		
		    // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","E:\\School\\year 4\\semester2\\quality assurance\\project\\phase 2\\code\\selenium driver\\code\\\\chromedriver.exe");  
	          
	        // Instantiate a ChromeDriver class to establish a connection       
	        WebDriver driver=new ChromeDriver();  
		
		
			//Puts an implicit wait, will wait for 10 seconds before throwing exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Launch Website
			driver.navigate().to("https://www.monsterindia.com/");
			
			//Maximize the Browser
			driver.manage().window().maximize();
			
			
			//log in process
            //click on login
            driver.findElement(By.xpath("//*[@id=\"seekerLoginBtn\"]/a/span[2]")).click();
           
            //enter username
            driver.findElement(By.xpath("//*[@id=\"signInName\"]")).sendKeys("mostafanegm153@gmail.com");
           
            //enter password
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mostafa1996");
           
            //click on login
            driver.findElement(By.xpath("//*[@id=\"signInbtn\"]")).click();
            
            //delay test for 10 seconds until login process end
            TimeUnit.SECONDS.sleep(10); 
            
            
///////////////////////////////////////////////////////////////////////////////////////////////////////////
            String expected = " ";
            
            //Click on dashboard
            driver.findElement(By.xpath("//*[@id=\"dashboardBtn\"]/a/span[1]\r\n")).click();

			
            //Check span of number of saved items
            String result = driver.findElement(By.xpath("//*[@id=\"navId\"]/li[3]/span/span\r\n")).getText();
            
            if(expected.equals(result)) 
            {
    			System.out.println("Correct");

            }else {	System.out.println("not Correct"); }
           
			
	}

}
