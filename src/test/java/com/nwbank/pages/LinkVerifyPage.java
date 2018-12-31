package com.nwbank.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nwbank.utilities.Driver;

public class LinkVerifyPage {

	private WebDriver driver;
	public LinkVerifyPage()  {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".text h1")
	public WebElement pageVerifyText;
}
