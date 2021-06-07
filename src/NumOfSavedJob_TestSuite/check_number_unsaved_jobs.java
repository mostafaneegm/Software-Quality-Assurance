package NumOfSavedJob_TestSuite;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class check_number_unsaved_jobs {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
driver=remove_saved_job.driver;
            
///////////////////////////////////////////////////////////////////////////////////////////////////////////
            String expected = " ";
            
            //Click on dashboard
            driver.findElement(By.xpath("//*[@id=\"dashboardBtn\"]/a/span[1]\r\n")).click();

			
            //Check span of number of saved items
            String result = driver.findElement(By.xpath("//*[@id=\"navId\"]/li[3]/span/span\r\n")).getText();
            
            if(result.equals(result)) 
            {
    			System.out.println("Correct");

            }else {	System.out.println("not Correct"); }
           
			
	}

}
