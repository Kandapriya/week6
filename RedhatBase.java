package week6Assignment;

import java.io.IOException;
import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.ExcelwtihTC;

public class RedhatBase {
	public RemoteWebDriver driver;
	public String exceldata;
	
	
	
     @Parameters({"url","browser"})
	 @BeforeMethod
	 
	 public void precondition(String url,String browser) {
    	 if (browser.equalsIgnoreCase("chrome")) {
     		driver=new ChromeDriver();
 			
 		} else if (browser.equals("edge")) {
 			driver=new EdgeDriver();
 			
 		} 
 		
 		driver.get(url);
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
     }
 	@DataProvider(name="getname")
 	public String[][] fetchdata() throws IOException{
 		String[][] commondata = redw3excel.common(exceldata);
 		//String[][] redData =RedExcel.redexcel1();
 		return commondata;

 }
	

}
