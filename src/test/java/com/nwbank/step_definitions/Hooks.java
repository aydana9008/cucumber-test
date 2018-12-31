package com.nwbank.step_definitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.nwbank.utilities.ConfigurationReader;
import com.nwbank.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
      public WebDriver driver;
      public Actions actions;
	@Before
	public void setUp() {
		driver = Driver.getDriver();
		actions = new Actions(driver);
		driver.get(ConfigurationReader.getProperty("bankurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Before("@signUp")
	public void setUpSignUp()  {
		  driver = Driver.getDriver();
		  driver.get(ConfigurationReader.getProperty("url"));
		  driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
					.getScreenshotAs(OutputType.BYTES);
		         scenario.embed(screenshot, "image/png");	
		}
		Driver.closeDriver();
	}
}
