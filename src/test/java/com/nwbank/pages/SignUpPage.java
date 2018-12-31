package com.nwbank.pages;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nwbank.utilities.Driver;

public class SignUpPage {
 private WebDriver driver;
	public SignUpPage() throws MalformedURLException {
		driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public WebElement label(String label) throws MalformedURLException {
		String css = "#OnlineEnrollment_personal label[for='"+label+"']+input";
		return Driver.getDriver().findElement(By.cssSelector(css));
	}
	
	@FindBy(css="#OnlineEnrollment_personal label:nth-child(1)")
	public List<WebElement> labelText;
	
	public WebElement requiredError(String label) throws MalformedURLException {
		String css = "[class*='"+label+"'] [data-fv-validator=\"notEmpty\"] ";
		return Driver.getDriver().findElement(By.cssSelector(css));
	}
	
	@FindBy(id="valrt_FirstName")
	public WebElement first_name;
	
	@FindBy(id="valrt_LastName")
	public WebElement last_name;
	
	@FindBy(name="SocialSecurity")
	public WebElement ss_number;
	
	@FindBy(id="valrt_DOB")
	public WebElement date_of_birth;
	
	
	@FindBy(id="valrt_ZipCode")
	public WebElement zip_code;
	
	@FindBy(id="valrt_ActivationCode")
	public WebElement activation_code;
	
	@FindBy(id="valrt_LoginID")
	public WebElement loginId;
 
	@FindBy(id="submit_button_OnlineEnrollment_personal")
	public WebElement continue_button;
	
	@FindBy(css="#alertBox>.row :nth-child(2)")
	public WebElement errorMessage;
	
	@FindBy(css=".ActivationCode.help-block :nth-child(2)")
	public WebElement activCodeError;
	
	@FindBy(css=".LoginID.help-block :nth-child(2)")
	public WebElement loginIDError;
	
	@FindBy(css=".ZipCode.help-block :nth-child(2)")
	public WebElement zipError;
	
	@FindBy(css=".DOB.help-block :nth-child(3)")
	public WebElement dobError;
	
	@FindBy(css=".SocialSecurity.help-block :nth-child(2)")
	public WebElement ssnError;
	
	@FindBy(css=".LastName.help-block :nth-child(2)")
	public WebElement lastNameError;
	
	@FindBy(css=".FirstName.help-block :nth-child(2)")
	public WebElement firstNameError;
	
	@FindBy(css="[style='width: 310px; top: 69px; display: block;']")
	public WebElement allErrorMessages;
}
