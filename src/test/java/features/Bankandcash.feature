
Feature: Techfios bank and cash New Account Functionality 
@Scenario
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	Given User is on the Techfios login page
	When User enters the username "<username>" 
	When User enters the password "<password>" 
	And  User clicks on signinButton "login" 
	Then User should land on Dashboard page 
	And User clicks on bankcash "bankCash" 
	And User clicks on new account "newAccount" 
	And User enters "<accountTitle>" in accounts page 
	And User enters "<description>" in accounts page 
	And User enters "<initialBalance>" in accounts page 
	And User enters "<accountNumber>" in accounts page 
	And User enters "<contactPerson>" in accounts page 
	And User enters "<Phone>" in accounts page 
	And User enters "internetBankingURL" in accounts page 
	And User clicks on "submit" 
	Then User should be able to validate account created successfully
	
	
	Examples:
	|username|passowrd|Accounttitle|Description|Initialbalance|Accountnum|Contactperson|Phone|Bankurl|
	|demo@techfios.com| abc123| check  |personal|   105|8765  |     anthony      |675432         |abc@fgh|