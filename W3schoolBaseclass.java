package week6Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ExcelwtihTC;

public class W3schoolBaseclass {
	public RemoteWebDriver driver;
	public String exceldata;
	
	
	
     @Parameters({"url","browser"})
     @BeforeMethod
	public  void percondition(String url,String browser) {
		// TODO Auto-generated method stub
    	 if(browser.equalsIgnoreCase("chrome")) {
 			driver  = new ChromeDriver();
 		}else if (browser.equalsIgnoreCase("edge")) {
 			driver  = new EdgeDriver();
 		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
     @DataProvider(name="getname" )
     public String[][] fetchdata() throws IOException{
    	 String[][] w3 = redw3excel.common(exceldata);
    	 //String[][] excelw3 = Excelw3.w3excelData();
		return w3;
    	 
     }
     
   @AfterMethod
   public void post() {
	   driver.close();
   }
}
