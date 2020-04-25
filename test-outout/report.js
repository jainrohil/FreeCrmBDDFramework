$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dell/eclipse-workspace/FreeCrmBDDFramework/FreeCrmBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 12,
  "name": "User is able to create a new contact",
  "description": "",
  "id": "free-crm-login-feature;user-is-able-to-create-a-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is already on the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User clicks on Contacts button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User clicks on New button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User Enters the Contact firstname and lastname",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User clicks on the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify new contact created",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_the_Home_Page()"
});
formatter.result({
  "duration": 13474136000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Contacts_button()"
});
formatter.result({
  "duration": 839578100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_New_button()"
});
formatter.result({
  "duration": 992778600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_Enters_the_Contact_firstname_and_lastname()"
});
formatter.result({
  "duration": 552389600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_the_Save_button()"
});
formatter.result({
  "duration": 120285900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.verify_new_contact_created()"
});
formatter.result({
  "duration": 5447717100,
  "status": "passed"
});
});