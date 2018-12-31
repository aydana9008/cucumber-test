package com.nwbank.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nwbank.utilities.Driver;

public class HomePage {

	private WebDriver driver;
	public HomePage()  {
		driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public WebElement headerLink(String linkText)  {
		String xpath = "//*[@class='primary']/li/*[text()='"+linkText+"']";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}
	
	public List<WebElement> headerLinkContents(int number) {
		String xpath = "//*[@class='primary']/li["+number+"]/ul/li/a";
		return Driver.getDriver().findElements(By.xpath(xpath));
	}
	
	@FindBy(css=".primary>li")
	public List<WebElement> headerLinks;
	
	@FindBy(id="geolocation")
	public WebElement useMyLocation;
	
	@FindBy(id="edit-zip")
	public WebElement zipcodeInput;
	
	public Select searchPurpose(String locator)  {
		return new Select(Driver.getDriver().findElement(By.id(locator)));
	}
	
	@FindBy(id="edit-submit")
	public WebElement searchButton;
}
