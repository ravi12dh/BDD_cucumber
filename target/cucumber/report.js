$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "TF login functionality validation",
  "description": "",
  "id": "tf-login-functionality-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3005879700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background"
    },
    {
      "line": 5,
      "value": "# Given user is on the techfios login page"
    }
  ],
  "line": 8,
  "name": "User Should be able to login with valid credentials",
  "description": "",
  "id": "tf-login-functionality-validation;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#When User enters \"username\" from mysql database"
    },
    {
      "line": 13,
      "value": "#When User enters \"password\" from mysql database"
    }
  ],
  "line": 15,
  "name": "User click on Signin button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should be on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDefinitions.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1367611600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepsDefinitions.user_enters_username_as(String)"
});
formatter.result({
  "duration": 2273400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepsDefinitions.user_enters_password_as(String)"
});
formatter.result({
  "duration": 60657100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinitions.user_click_on_Signin_button()"
});
formatter.result({
  "duration": 967458600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinitions.user_should_be_on_Dashboard_page()"
});
formatter.result({
  "duration": 8189400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat steps.LoginStepsDefinitions.user_should_be_on_Dashboard_page(LoginStepsDefinitions.java:58)\r\n\tat ✽.Then User should be on Dashboard page(features/Login.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 608528300,
  "status": "passed"
});
});