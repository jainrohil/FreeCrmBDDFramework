Feature: Deals Data Creation 

Scenario: Free CRM Create a new deal 

	Given User is already on thee Login Page 
	When Title of thee Login Page is Free CRM 
	Then User enters thee username and password 
		| username              | password   |
		| jainrohil09@gmail.com | Nokia5800* |
	Then User clicks onn login button
	Then User is onn Home Page 
	Then User clicks on thee Deal button 
	Then User enterss deal details 
		| Title      | Amount| Probability| Commission |
		| test deal1 | 1000  | 50         | 10         |
		| test deal2 | 2000  | 60         | 20         |
		| test deal3 | 3000  | 70         | 30         |
	Then User closes thee browserr