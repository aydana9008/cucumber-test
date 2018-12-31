@main
Feature: Verify home page of NW Bank application
Background: 
Given user uploads nw bank app


Scenario: Verify header link 1 of the app
When user clicks on "Bank" Link
Then title of the page should contain "Bank"
And the first heading text should be "Bank"


Scenario: Verify header link 2 of the app
When user clicks on "Borrow" Link
Then title of the page should contain "Borrow | Northwest Bank"
And the first heading text should be "Borrow"




Scenario: Verify header link 3 of the app
When user clicks on "Invest" Link
Then title of the page should contain "Invest"
And the first heading text should be "Invest"


Scenario: Verify header link 4 of the app
When user clicks on "Insure" Link
Then title of the page should contain "Insure"
And the first heading text should be "Insure"


Scenario: Verify header link 5 of the app
When user clicks on "Plan" Link
Then title of the page should contain "Plan"
And the first heading text should be "Plan"



Scenario: Verify location search of NW Bank ATM
   When user enters "15217" in zipcode input box and selects "ATM" purpose option
   And clicks on search button
   Then users "15217" zip code information should appear on Result page


Scenario: Verify location search of NW Bank Branch
When user enters "15213" in zipcode input box and selects "Branch" purpose option
And clicks on search button
Then users "15213" zip code information should appear on Result page


Scenario: Verify location search of NW Bank ATM and Branch
When user enters "15146" in zipcode input box and selects "Both" purpose option
And clicks on search button
Then users "15146" zip code information should appear on Result page


Scenario: Verify the Header link contents
   When user mouse hovers over header links and verifies the following contents:
   |Bank   | Checking, Savings, Online and Mobile Banking, Other Ways To Connect   |
   |Borrow | Mortgage Loans, Home Equity Loans, Personal Loans, Credit Cards       |
   |Invest | Investments, Financial Planning, Trust Services, Oil, Gas and Mineral  |
   |Insure | Property and Casualty, Life and Disability, Quote Center              |
   |Plan   |                                                                       |
   
  
  
 
Scenario Outline: Verify the <header> link contents
   When user mouse hovers over "<header>" link
   Then verifies the following "<header>" contents : 
   |name   |<header> |
   |content|<contents>|  

   Examples:
   |header | contents                                                             |
   |Bank   | Checking, Savings, Online and Mobile Banking, Other Ways To Connect  |
   |Borrow |Mortgage Loans, Home Equity Loans, Personal Loans, Credit Cards       |
   |Invest |Investments, Financial Planning, Trust Services, Oil, Gas and Mineral |
   |Insure | Property and Casualty, Life and Disability, Quote Center             |
   |Plan   |                                                                 |
  
  
 
   Scenario Outline: Verify header <link> of the app
   When user clicks on "<link>" Link
   Then title of the page should contain "<title>"
   Then url address has to be verified
   |Title | <title>|
   |URL   | <url>  |
   And the first heading text should be "<link>"
   
   Examples: 
   |link    |  title                                    |url    |
   |Bank    |Personal Bank \| Northwest Bank            |https://www.northwest.bank/personal/bank|
   |Borrow  |Borrow \| Northwest Bank                   |https://www.northwest.bank/personal/borrow|
   |Invest  |Invest \| Northwest Bank                   |https://www.northwest.bank/personal/invest|
   |Insure  |Insure \| Northwest Bank                   |https://www.northwest.bank/personal/insure|
   |Plan    |Plan \| Northwest Bank                     |https://www.northwest.bank/personal/plan|
   
   
 Scenario Outline: Verify location search of NW Bank ATM
   When user enters "<zipCode>" in zipcode input box and selects "<purpose>" purpose option
   And clicks on search button
   Then users "<zipCode>" zip code information should appear on Result page
   
  Examples:
  |zipCode  | purpose|
  |15217    |ATM     |
  |15213    |Branch  |
  |15146    |Both    | 
   
   
   
   