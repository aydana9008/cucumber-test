package com.nwbank.step_definitions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.interactions.Actions;

import com.nwbank.pages.HomePage;
import com.nwbank.pages.LinkVerifyPage;
import com.nwbank.pages.SignUpPage;
import com.nwbank.pages.nwBankLocationSearchPage;
import com.nwbank.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class nwBankMainPage_Test{
    
	
	@Given("user uploads nw bank app")
	public void user_uploads_nw_bank_app() {
		System.out.println("Opening the browser");
	}

	@When("user clicks on {string} Link")
	public void user_clicks_on_Link(String link){
		HomePage homePage = new HomePage();
		homePage.headerLink(link).click();
	}

	@Then("title of the page should contain {string}")
	public void title_of_the_page_should_contain(String pageTitle)  {
		
	   assertTrue(Driver.getDriver().getTitle().contains(pageTitle));
	}

	@Then("url address has to be verified")
	public void url_address_has_to_be_verified(Map<String, String> url)  {
	    String expectedurl = url.get("URL");
	    assertEquals(expectedurl, Driver.getDriver().getCurrentUrl());
	}
	
	@Then("the first heading text should be {string}")
	public void the_first_heading_text_should_be(String headingText)  {
		LinkVerifyPage linkPage = new LinkVerifyPage();
	   String actualText = linkPage.pageVerifyText.getText();
	   assertTrue(actualText.contains(headingText));
	}
	/////////
	
	@When("user enters {string} in zipcode input box and selects {string} purpose option")
	public void user_enters_in_zipcode_input_box_and_selects_purpose_option(String zipcode, String option)  {
		HomePage homePage = new HomePage();
		homePage.zipcodeInput.sendKeys(zipcode);
		homePage.searchPurpose("edit-type").selectByVisibleText(option);
 		
	}

	@When("clicks on search button")
	public void clicks_on_search_button()  {
		HomePage homePage = new HomePage();
	       homePage.searchButton.click();
	}

	@Then("users {string} zip code information should appear on Result page")
	public void users_zip_code_information_should_appear_on_Result_page(String zipcode) {
		nwBankLocationSearchPage LocationSearchPage = new nwBankLocationSearchPage();
		assertTrue(LocationSearchPage.result.getText().contains(zipcode));
	  
	}
	

	
	@When("user mouse hovers over header links and verifies the following contents:")
	public void user_mouse_hovers_over_header_links_and_verifies_the_following_contents(Map<String,String> linkContents)  {
		HomePage homePage = new HomePage();
		Actions actions = new Actions(Driver.getDriver());
           List<String> actualBankContents = new ArrayList<>();
		   String expectedBankContents = linkContents.get("Bank");
		   String expectedBorrowContents = linkContents.get("Borrow");
		   String expectedInvestContents = linkContents.get("Invest");
		   String expectedInsureContents = linkContents.get("Insure");
		   String expectedPlanContents = linkContents.get("Plan");
		   
		   int count = 0;
		   for(int i =0;i < homePage.headerLinks.size(); i++) {
		  String linkName = homePage.headerLinks.get(i).getText();
		  System.out.println(linkName);
		  actions.moveToElement(homePage.headerLink(linkName)).perform();
		  for(int j = 0; j < homePage.headerLinkContents(i+1).size(); j++) {
			 actualBankContents.add(homePage.headerLinkContents(i+1).get(j).getText());	 
		  }
		  if(count==1) {
			  expectedBankContents=expectedBorrowContents;
		  }else if(count==2) {
			  expectedBankContents=expectedInvestContents;
		  }else if(count ==3) {
			  expectedBankContents=expectedInsureContents;
		  }else if(count==4) {
			  expectedBankContents=expectedPlanContents;
		  }
		  String actualResult = actualBankContents.toString().substring(1, actualBankContents.toString().length()-1);
		  assertTrue(actualResult.contains(expectedBankContents));
		  actualBankContents.clear(); 
		  count++;
	  }
	}
		

@When("user mouse hovers over {string} link")
public void user_mouse_hovers_over_link(String linkName)  {
	HomePage homePage = new HomePage();
	Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(homePage.headerLink(linkName)).perform();
    
}

@Then("verifies the following {string} contents :")
public void verifies_the_following_contents(String link, Map<String, String> linkContents)  {
	HomePage homePage = new HomePage();
	String expectedBankContents = linkContents.get("content");
	List<String> actualBankContents = new ArrayList<>();
    if(link.equals(homePage.headerLink("Bank").getText())) {
    	 for(int j = 0; j < homePage.headerLinkContents(1).size(); j++) {
			 actualBankContents.add(homePage.headerLinkContents(1).get(j).getText());	 
		  }
    	 String actualResult = actualBankContents.toString().substring(1, actualBankContents.toString().length()-1);
    	 assertEquals(expectedBankContents, actualResult);
    }else if(link.equals(homePage.headerLink("Borrow").getText())) {
    	for(int j = 0; j < homePage.headerLinkContents(2).size(); j++) {
			 actualBankContents.add(homePage.headerLinkContents(2).get(j).getText());	 
		  }
    	String actualResult = actualBankContents.toString().substring(1, actualBankContents.toString().length()-1);
   	    assertEquals(expectedBankContents, actualResult);
    	
    }else if(link.equals(homePage.headerLink("Invest").getText())) {
    	for(int j = 0; j < homePage.headerLinkContents(3).size(); j++) {
			 actualBankContents.add(homePage.headerLinkContents(3).get(j).getText());	 
		  }
    	String actualResult = actualBankContents.toString().substring(1, actualBankContents.toString().length()-1);
   	 assertEquals(expectedBankContents, actualResult);
    }else if(link.equals(homePage.headerLink("Insure").getText())) {
    	for(int j = 0; j < homePage.headerLinkContents(4).size(); j++) {
			 actualBankContents.add(homePage.headerLinkContents(4).get(j).getText());	 
		  }
    	String actualResult = actualBankContents.toString().substring(1, actualBankContents.toString().length()-1);
   	 assertEquals(expectedBankContents, actualResult);
    }else if(link.equals(homePage.headerLink("Plan").getText())) {
    	for(int j = 0; j < homePage.headerLinkContents(5).size(); j++) {
			 actualBankContents.add(homePage.headerLinkContents(5).get(j).getText());	 
		  }
    	String actualResult = actualBankContents.toString().substring(1, actualBankContents.toString().length()-1);
   	 assertEquals(expectedBankContents, actualResult);
    }
}
	  
	}

