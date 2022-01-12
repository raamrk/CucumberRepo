Feature: TestNOP

Background:
	Given  User Launches chrome browser
	When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	And user enters Email as "admin@yourstore.com" and Password as "admin"
	And click on login button
	Then Page Title should be "Dashboard / nopCommerce administration" user able to view Dashboard

@smoke
Scenario: verify login feature with valid user credntails-Smoke
	When User clicks on Logout Button
	Then Page Title should be "Your store. Login" user able to view Dashboard
	And close browser
	
@smoke @regression
Scenario: verify login feature with valid user credntails-Smoke And Regression
	When User clicks on Logout Button
	Then Page Title should be "Your store. Login" user able to view Dashboard
	And close browser


	