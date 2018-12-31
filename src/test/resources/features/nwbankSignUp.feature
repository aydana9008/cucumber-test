@signUp
Feature: Verify the sign Up Page of NW Bank

Background: 
  Given user navigates to the Sign Up page


Scenario:  all labels on sign up page should be displayed
   Then all labels are displayed in the following order:
   |FIRST NAME: | 
   |LAST NAME:|
   |SOCIAL SECURITY NUMBER:     |
   |DATE OF BIRTH (mm/dd/yyyy):     |
   |ZIP/POSTAL CODE:|
   |ACTIVATION CODE: |
   |REQUESTED LOGIN ID: |



Scenario Outline: <First Name> should be able to fill out the sign up page form
    When user enters the following information
    |firstName| <First Name>|
    |lastName | <Last Name>  |
    |ssn      |<SSN>|
    |dob      |<DOB>|
    |activ    |<Activation Code>|
    And clicks on continue button
    
    Examples:
    |First Name | Last Name| SSN      | DOB      | Activation Code|
    |Mike       | Smith    | 123562334|11/12/1988|1234563         |
    |Bulat      | Candy    |765654544 |10/30/1990| 4563453        |
    |Mary       | Johnson  |345342334 |13/06/1978|2143254         |
   
   
#   @temp
#   Scenario Outline: user should be able to fill out the sign up page form
#    When user enters "<First Name>" "<Last Name>" "<SSN>" "<DOB>" "<Activation Code>"
#    And clicks on continue button
#    
#    Examples:
#    |First Name | Last Name| SSN      | DOB      | Activation Code|
#    |Mike       | Smith    | 123562334|11/12/1988|1234563         |
#    |Bulat      | Candy    |765654544 |10/30/1990| 4563453        |
#    |Mary       | Johnson  |345342334 |13/06/1978|2143254         | 
