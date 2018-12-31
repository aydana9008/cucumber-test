package com.nwbank.pages;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nwbank.utilities.Driver;

public class nwBankLocationSearchPage {

	private WebDriver driver;
	public nwBankLocationSearchPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="result-type")
	public WebElement result;
	
	@FindBy(css=".result-type>em")
	public WebElement zipCodeResult;
	
	@FindBy(id="map")
	public WebElement map;
}
