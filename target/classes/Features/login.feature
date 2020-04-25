Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario

#Given User is already on Login Page
#When Title of Login Page is Free CRM
#Then User enters username and password
#Then User enters "jainrohil09@gmail.com" and "Nokia5800*
#Then User clicks on the login button
#Then User is on the Home Page
#Then User closes the browser

#With Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on the login button
Then User is on the Home Page
Then User closes the browser

Examples:
	| username | password |
	| jainrohil09@gmail.com | Nokia5800*|
    | tom | test@123|

#Scenario: User is able to create a new contact
#Given User is already on the Home Page
#Then User clicks on Contacts button
#Then User clicks on New button
#Then User Enters the Contact firstname and lastname
#Then User clicks on the Save button
#Then Verify new contact created