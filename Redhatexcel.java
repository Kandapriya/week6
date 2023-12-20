package week6Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Redhatexcel extends RedhatBase {
	@BeforeTest
	public void rdata() {
		exceldata="redhat";
	}
	
	
	 @Test(dataProvider = "getname")
	public void Runredhat(String login,String pw,String email,String phno ) {
		// TODO Auto-generated method stub
    	
		
		//Click on the "Register for a Red Hat account" button.
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//button[@id='truste-consent-button']"))).click().perform();
		driver.findElement(By.xpath("//button[@id='rh-registration-link']")).click();
		//ac.moveToElement(driver.findElement(By.xpath("//button[@id='truste-consent-button']"))).click().perform();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(login);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='user.attributes.phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Create my account']")).click();

	}

}
