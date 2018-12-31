@signUp
Feature: Sign Up page -Negative
Background:
 Given go to nwbank sign up page
 

Scenario: Verify the Last Name error message
When fill out the input info
Then click on sign up button
And A Last Name Required error message should be generated


Scenario: Verify the First Name error message
When leave the first name input box empty
And click on sign up button
Then A First Name Required error message should be generated


Scenario: Verify the SSN error message
When user leaves SSN input box empty
And SSN field is Required error message must be generated


Scenario: Verify date of birth error message
When date of birth input box left empty
Then DateOfBirth Required error message should be generated


Scenario: Verify zipcode error message
When "ZipCode" input box left empty
Then The system should generate "Zip/Postal Code is required." error message


Scenario: Verify activationID error message
When "ActivationCode" input box left empty
Then The system should generate "If you do not have your activation code, please call 1-877-672-5678, option 2 or visit your local office." error message


Scenario: Verify LoginID error message
  When "LoginID" input box left empty
  Then The system should generate "Requested Login ID is required." error message


