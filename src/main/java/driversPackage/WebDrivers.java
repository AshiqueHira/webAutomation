package driversPackage;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivers {
	
	public WebDriver webDriver;
	
	public void firefox(String URL) {
		
		WebDriverManager.firefoxdriver().setup();
		
		webDriver = new FirefoxDriver();
		webDriver.navigate().to(URL);
		webDriver.manage().window().maximize();
		
		
	}
	
	public void chrome(String URL) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, options);
		webDriver = new ChromeDriver(options);
		webDriver.get(URL);
		webDriver.manage().window().maximize();
	}

}
