package TestNG_savejobs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class login {
	 public static WebDriver driver= new ChromeDriver();

  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\School\\year 4\\semester2\\quality assurance\\project\\phase 2\\code\\selenium driver\\code\\\\chromedriver.exe");  
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("https://www.monsterindia.com/");
      driver.manage().window().maximize();
      //click on login
      driver.findElement(By.xpath("//*[@id=\"seekerLoginBtn\"]/a/span[2]")).click();

      //enter username
      driver.findElement(By.xpath("//*[@id=\"signInName\"]")).sendKeys("tooty.amicii@gmail.com");

      //enter password
      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tooty1234");

      //click on login
      driver.findElement(By.xpath("//*[@id=\"signInbtn\"]")).click();

      //delay test for 10 seconds until login process end
      Thread.sleep(1000);
      String error = driver.findElement(By.id("error")).getText();

      if (error.equals("Invalid password")) 
      { System.out.println("Wrong password");}
      else {System.out.println("Login");}

  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
