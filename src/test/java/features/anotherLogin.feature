Feature: TF login functionality validation 


#Background
# Given user is on the techfios login page
@Scenario2
Scenario: Other feature -User Should be able to login with valid credentials 
	Given User is on techfios login page   
	When User enters username as "demo@techfios.com"              
	When User enters password as "abc123"            
	When User click on Signin button 
	Then User should be on Dashboard page  
	
 
 