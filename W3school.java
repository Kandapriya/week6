package week6Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class W3school extends W3schoolBaseclass {
	@BeforeTest
	public void w3data(){
		
	exceldata = "wschoolexcel";
	}
	
	
    @Test(dataProvider = "getname")
	public  void runW3school(String namec,String ccno,String expmon,String cvv,String expyr,String fname,String mail,String adr,String zip,String state) {
		// TODO Auto-generated method stub
    	driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(namec);
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(ccno);
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(expmon);
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(expyr);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(adr);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys( zip);
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
		String text = driver.findElement(By.xpath("//h2[text()='Responsive Checkout Form']")).getText();
		//System.out.println(text);
		if (text.contains(text)) {
			System.out.println("sucessfully created");
			
		}
		else {
		System.out.println("not created");	
		}
		
		}
		

	}


