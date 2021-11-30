Feature: Mynta home page scenarios
@MyntraLog
Scenario: Login to the account
Given User is on Myntra Home Page
When User hover on Profile icon
And User click the Login/SignUp link
Then User navigate to the Login Page
When User enters the phone number "8448616843"
And User clicks on continue button
And User click on Password
And User enter the Password "Singhal0123@"
And User clicked on the Login button
Then User navigated to the Myntra Home Page