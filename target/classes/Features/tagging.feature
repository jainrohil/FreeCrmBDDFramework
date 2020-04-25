@FunctionalTest
Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and corect password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and corect password
Given This is an invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test

@RegressionTest
Scenario: Create a task
Given This is a task test

@SmokeTest
Scenario: Create a case
Given This is a case test

@SmokeTest @RegressionTest
Scenario: search a deal
Given This is a search deal test

@SmokeTest
Scenario: search a contact
Given This is a search contact test

@SmokeTest
Scenario: search an email
Given This is an search email test