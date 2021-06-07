package MonsterIndia;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class login {

    public static WebDriver driver;
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
        
        try {
            //log in process
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

        }catch (Exception e) {
        }

    }
 
}