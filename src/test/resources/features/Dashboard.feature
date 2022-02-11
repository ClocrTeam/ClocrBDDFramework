# Author(Optional): Rekha
# DB001 to DB012 

@dashboard
Feature: Dashboard page scenarios
 
Background: User should be on Dashboard page
	When Enter user name as "pankaj.clocr@yopmail.com"
	And click on Proceed button
	And enter correct "Welcome@123"
	And Click on Login button 
	
Scenario Outline: User get a link Create your Emergency Card
	Then User should be redirected to dashboard page
	Then User creates new emergency card if not created
	Then User should be redirected to dashboard page
	When Click on Update Info of Personal menu
	Then User should redirects to Personal workflow page
	Then User should be redirected to dashboard page


	Examples:
      | email | password |
      | pankaj.clocr@yopmail.com | Welcome@123 | 
      
      
   
