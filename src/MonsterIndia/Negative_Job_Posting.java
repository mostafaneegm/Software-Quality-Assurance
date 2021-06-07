package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative_Job_Posting {
	
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
			
			
			
			
			
	////////////////////////////////////////////////////////////////////////////////////////////////////////////

			//String Expected = "Thank you, our sales representative will get in touch with you shortly.";

			
			//Click on Job posting
			driver.findElement(By.xpath("//*[@id=\"20\"]/div/ul/li[2]/a")).click();
			
			//Click on Request Demo
			driver.findElement(By.xpath("/html/body/div/div[8]/a")).click();
			
			//Click Submit Button
			driver.findElement(By.xpath("//*[@id=\"connectBtn\"]")).click();
			
			TimeUnit.SECONDS.sleep(2);
			
			//check that the negative input message exist correctly and the panel doesn't accept empty inputs
            String expected = "Name field is empty !!";
            String result = driver.findElement(By.xpath("//*[@id=\"message_board_lets\"]")).getText();

			if(expected.equals(result))
			{
				System.out.println("Correct");
				
			} 
			else {System.out.println("Not Correct");
			}

			//Finally you must Close and Quit the Browser
			driver.close();
			driver.quit();
			
			
			
	}
}
