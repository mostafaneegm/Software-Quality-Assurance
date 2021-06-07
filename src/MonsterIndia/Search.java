package MonsterIndia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	
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
		
			
/////////////////////////////////////////////////////////////////////////////////////
			
			

			//Click on Search and type desired job
			//driver.findElement(By.xpath("//*[@id=\"SE_home_autocomplete\"]")).click();



			driver.findElement(By.id("SE_home_autocomplete")).sendKeys("Software engineering");



			//Click on Search button
			driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div/div[2]/input")).click();
			


			//catching the text in search results
			String result =driver.findElement(By.xpath("//*[@id=\"srp-right-part\"]/div/div[1]/div/div/div[2]/div/div[11]/div[1]/div[1]/div/div/h3/a")).getText();


			//wait untill the search process end
			TimeUnit.SECONDS.sleep(10);


			//comparing between the expected result and the output
			String expected ="software developer / Software Engineer / Software Engineer / Freshers";
			if(expected.equals(result)) {

			System.out.println("exist");
			}else {System.out.println("not exist");}



			//Finally you must Close and Quit the Browser
			//driver.close();
			//driver.quit();


			
			
	}
}
