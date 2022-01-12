$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/TestNop.feature");
formatter.feature({
  "name": "TestNOP",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_Launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\" user able to view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.page_Title_should_be_user_able_to_view_Dashboard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify login feature with valid user credntails-Smoke",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks on Logout Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_clicks_on_Logout_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\" user able to view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.page_Title_should_be_user_able_to_view_Dashboard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_Launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\" user able to view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.page_Title_should_be_user_able_to_view_Dashboard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify login feature with valid user credntails-Smoke And Regression",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User clicks on Logout Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Steps.user_clicks_on_Logout_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\" user able to view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Steps.page_Title_should_be_user_able_to_view_Dashboard(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});