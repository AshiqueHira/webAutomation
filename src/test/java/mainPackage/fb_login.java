package mainPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.inject.CreationException;

import driversPackage.WebDrivers;
import inputPackage.Credentials;
import inspectedElementsPackage.LoginElements;
import urlsPackage.Url;
import org.openqa.selenium.Alert;

public class fb_login {
	
	WebDrivers driver= new WebDrivers();
	Url url =  new Url();
	LoginElements loginElements =  new LoginElements();
	Credentials credentials = new Credentials();

	@BeforeClass
	public void openBrowser() {
		// opening the browser with url facebook.com
		driver.chrome(url.fb_url);
	}
	
	public void login() {
		driver.webDriver.findElement(By.xpath(loginElements.login)).click();
	}
	public void login2() {
		driver.webDriver.findElement(By.xpath(loginElements.login2)).click();
	}
	
	@Test(priority=1)
	public void without_username_without_password() throws InterruptedException{
		// calling login
		login();
		WebElement em1 = driver.webDriver.findElement(By.xpath(loginElements.noEmailNoPasswordVerification));
		String actualResult = em1.getText().toString();
		//String expectedResult = "Wrong credentials";
		String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		assertEquals(expectedResult, actualResult);
	}
	/*
	
	@Test(priority=2)
	public void without_username_with_invalid_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.password2)).sendKeys(credentials.invalidPassword);
		login2();
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority=3)
	public void without_username_with_valid_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.password2)).sendKeys(credentials.password);
		login2();
		try {
			driver.webDriver.findElement(By.xpath(loginElements.popupClose)).click();
		}catch(Exception e) {
			  e.printStackTrace();
		}
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test(priority=4)
	public void with_username_without_password() throws InterruptedException {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.email)).sendKeys(credentials.email);
		login2();
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The password that you've entered is incorrect. Forgotten password?";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority=5)
	public void valid_username_with_invalid_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.email)).sendKeys(credentials.email);
		driver.webDriver.findElement(By.xpath(loginElements.password2 )).sendKeys(credentials.invalidPassword);
		login2();
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The password that you've entered is incorrect. Forgotten password?";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority=6)
	public void invalid_username_without_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.email)).sendKeys(credentials.invalidEmail);
		login2();
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The email address you entered isn't connected to an account. Create a new Facebook account.";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority=7)
	public void invalid_username_with_invalid_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.email2)).sendKeys(credentials.invalidEmail);
		driver.webDriver.findElement(By.xpath(loginElements.password2)).sendKeys(credentials.invalidPassword);		
		login2();
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The email address you entered isn't connected to an account. Create a new Facebook account.";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority=8)
	public void invalid_username_with_valid_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.email)).sendKeys(credentials.invalidEmail);
		driver.webDriver.findElement(By.xpath(loginElements.password)).sendKeys(credentials.password);		
		login2();
		
		//driver.webDriver.findElement(By.xpath(loginElements.popupClose)).click();
		//driver.webDriver.switchTo().alert().dismiss(); 
		
		WebElement em2 = driver.webDriver.findElement(By.xpath(loginElements.genVarification));
		String expectedResult = "Wrong credentials";
		//String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String actualResult = em2.getText().toString();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(priority=9)
	public void valid_username_with_valid_password() {
		driver.webDriver.navigate().refresh();
		driver.webDriver.findElement(By.xpath(loginElements.email)).sendKeys(credentials.email);
		driver.webDriver.findElement(By.xpath(loginElements.password)).sendKeys(credentials.password);		
		login2();
		
	}
	*/

	
	
}












