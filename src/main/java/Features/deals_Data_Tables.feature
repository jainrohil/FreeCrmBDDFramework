Feature: Deals Data Creation

Scenario: Free CRM Create a new deal

Given User is already on the Login Page
When Title of the Login Page is Free CRM
Then User enters the username and password
| jainrohil09@gmail.com | Nokia5800* |
Then User clicks on login button
Then User is on Home Page
Then User clicks on the Deal button
Then User enters deal details
| test deal | 1000 | 50 | 10 |
Then User closes the browserr