Feature: TestNOP

Background:
	Given  User Launches chrome browser
	When user opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	And user enters Email as '<email>' and Password as '<password>'
	And click on login button
	Then Page Title should be "Dashboard / nopCommerce administration" user able to view Dashboard

@regression
Scenario Outline: verify login feature with valid user credntails & add customer-Regression
	When User clicks on Customericon
	And User clicks on AddNewData
	When User clicks on Logout Button
	Then Page Title should be "Your store. Login" user able to view Dashboard
	And close browser
	
	
	Examples:
	|	email|password|
	|	admin@yourstore.com|admin|
	|	admin1@yourstore.com|admin|