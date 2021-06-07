package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class job_posting_employe_check {
	
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
			
			
/////////////////////////////////////////////////////////////////////////////////////////////////////
			
			//Click on Job posting
			driver.findElement(By.xpath("//*[@id=\"20\"]/div/ul/li[2]/a")).click();
			
			//Click on Request Demo
			driver.findElement(By.xpath("/html/body/div/div[8]/a")).click();
					
			
			//Click on Employee radio-button
			driver.findElement(By.xpath("//*[@id=\"req_type1\"]\r\n")).click();
			
			
			
			//check if the radio button is selected
			boolean selected = driver.findElement(By.id("req_type1")).isSelected();

			
			//check if the radio button is enabled after click on it
			boolean enabled = driver.findElement(By.id("req_type1")).isEnabled();
			
			
			if(selected == true) {
				System.out.println("The radio button is selected 'employer'");
			
			if (enabled == true) {
				System.out.println("The radio button is enabled 'employer'");
			}
			else {System.out.println("The radio button is not enabled");}
		} else {System.out.println("The radio button is not selected 'employer'");}
			
			
	}

}
