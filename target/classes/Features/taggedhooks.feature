Feature: Free CRM app test

@First
Scenario: Free crm create deal test -taggedhooks
Given user is on the deals page -taggedhooks
When Use fills the deal details -taggedhooks
Then deal is created -taggedhooks

@Second
Scenario: Free crm create contactss test -taggedhooks
Given user is on the contactss page -taggedhooks
When Use fillss the contacts details -taggedhooks
Then contact is created -taggedhooks

@Third
Scenario: Free crm create case test -taggedhooks
Given user is on the case page -taggedhooks
When Use fillss the case details -taggedhooks
Then case is created -taggedhooks