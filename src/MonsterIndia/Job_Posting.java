package MonsterIndia;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Job_Posting {

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
				
		
		//Click on Employee radio-button
		driver.findElement(By.xpath("//*[@id=\"req_type1\"]\r\n")).click();

		
		//Enter the name in the text field
		driver.findElement(By.id("textfield")).sendKeys("Mostafa Ebrahim Negm");
		
		
		//Enter Number of std code
		driver.findElement(By.id("std_code")).sendKeys("0020");
		
		
		//Enter Number of contact number 
		driver.findElement(By.id("contactno")).sendKeys("1275744422");
		
		
		//Enter Email
		driver.findElement(By.id("txtEmail")).sendKeys("mostafanegm38@yahoo.com");
		
				
		//Enter Org name
		driver.findElement(By.id("frminboundorgname")).sendKeys("The British University in Egypt");
		
		//Choose Hiring requirement Immediate
		driver.findElement(By.xpath("//*[@id=\"reqt_container\"]/div[1]/div[1]/div[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"reqt_container\"]/div[1]/div[3]/ul/li[2]/a\r\n")).click();

		//WebElement dropdownField = driver.findElement(By.id("frminboundhiringreq"));
		//Select select = new Select(dropdownField);
		//select.selectByValue("Immediate");
		
		
		//Click Submit Button
		driver.findElement(By.xpath("//*[@id=\"connectBtn\"]")).click();
		
		// we made a time out as the steps been made too fast before the message popup 
		TimeUnit.SECONDS.sleep(10);
		
		//Get the Result displayed based on its XPath
		
		
		//String result = driver.findElement(By.xpath("//*[@id=\"letscall_message_board\"]")).getText();


		if(driver.findElement(By.xpath("//*[@id=\"message_board_lets\"]")).isDisplayed())
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
