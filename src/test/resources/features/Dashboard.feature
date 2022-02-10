# Author(Optional): Rekha
# DB001 to DB012 

@dashboard
Feature: Dashboard page scenarios

#Scenario Outline: User should be able to navigate to Dashboard pages.
	
	#Given Browser should be open and user should be 'dev.clocr.com' site
	#When Enter user name as "<email>"
	#And click on Proceed button
	#And enter correct "<password>"
	#And Click on Login button
	#Then User should be redirected to dashboard page
	#Then User should be redirected to 'Your Digital Estate' page
	#Then User should redirected to 'Digital Vault' page
	#Then User should redirected to 'Time Capsule' page
	#Then User should redirected to 'My Contacts' page
	
#Examples:
 #     |url| email | password |
  #    |dev.clocr.com | ghj@yopmail.com | Rekha@1234 | 
	
Scenario Outline: User get a link Create your Emergency Card
	Given Browser should be open and user should be 'dev.clocr.com' site
	When Enter user name as "<email>"
	And click on Proceed button
	And enter correct "<password>"
	And Click on Login button
	Then User should be redirected to dashboard page
	Then User creates new emergency card if not created
	Then User should be redirected to dashboard page
	When Click on Update Info of Personal menu
	Then User should redirects to Personal workflow page
	Then User should be redirected to dashboard page
	Then Close the browser
	

	Examples:
      |url| email | password |
      |dev.clocr.com | ghj@yopmail.com | Rekha@1234 | 
