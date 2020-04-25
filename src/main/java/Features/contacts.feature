Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact Scenario

Given User is already on Login Page
When Title of Login Page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on the login button
Then User is on the Home Page
Then User clicks on Contacts button
Then User clicks on New button
Then user enters "<firstname>", "<lastname>" and "<position>"
Then User clicks on the Save button
Then User closes the browser


Examples:
		| username 			    | password   | firstname | lastname | position       |
		| jainrohil09@gmail.com | Nokia5800* | Tom1      | Smith1   | Manager        |
		| jainrohil09@gmail.com | Nokia5800* | Tom2      | Smith2   | Senior Manager |
