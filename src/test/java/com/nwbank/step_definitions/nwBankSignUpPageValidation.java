package com.nwbank.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.nwbank.pages.SignUpPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class nwBankSignUpPageValidation {

	
	@Given("user navigates to the Sign Up page")
	public void user_navigates_to_the_Sign_Up_page() {
	   System.out.println("OPening the browser");
	}

	@Then("all labels are displayed in the following order:")
	public void all_labels_are_displayed_in_the_following_order(List<String> labels) throws MalformedURLException {
		SignUpPage signupPage = new SignUpPage();
		List<String> actualLabel = new ArrayList<>();
		for (WebElement labelText : signupPage.labelText) {
			actualLabel.add(labelText.getText());
		}
		assertEquals(labels, actualLabel);
	}
}
