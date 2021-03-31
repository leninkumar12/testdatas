Feature: Login functionality for Adactin application 


#Background:
#Given user launch application 
#	When user enter "SowmiyaSri" as username 
#	And user enter "Sowmiya05" as password 
#	Then user verify valid username and valid password 
#	
	
Scenario: user enter valid username and valid password 
	Given user launch application 
	When user enter "SowmiyaSri" as username 
	And user enter "Sowmiya05" as password 
	Then user verify valid username and valid password 
	
Scenario: 
	user selected valid location,valid hotels,valid roomtype,valid number of rooms,valid check-in date,valid check-out date,valid adults and valid childrens 
	Given user selected sydeny as location 
	When  user selected hotel creek as hotel 
	And  user selected Standard as room type 
	And  user selected 1-One as number of rooms 
	And user enter 01/04/21 as check-in date 
	And user enter 02/04/21 as check-out date 
	And user selected 1-One as adults 
	And user selected 1-One as Validchildren 
	Then user verify valid location,valid hotels,valid roomtype,valid number of rooms,valid check-in date,valid check-out date,valid adults and valid childrens 
	
Scenario: User selecting the hotel 
	Given user selecting the hotel 
	Then user validate to continue 
	
	
Scenario: user enter a valid first_name,valid last_name,valid billing_address,valid credit_card number,valid credit card type,valid expiry date and valid cvv number
	Given user enter "lenin" as first_name
	When user enter "kumar" as last_name
	And user enter "Greens technology" as billing address
	And user enter "5647764839230494" as credit card number
	And user selected VISA as credit card type
	And user selected  Jan as month
	And user selected 2024 as year
	And user enter "144" as cvv
	Then user verify valid first_name,valid last_name,valid billing_Address,valid credit_card number,valid credit card type and valid cvv
	
	
Scenario: user completed validation.
 Then user successfully completed validation.
 