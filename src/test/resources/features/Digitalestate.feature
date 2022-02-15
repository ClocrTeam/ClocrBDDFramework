#Author: Rekha
#Keywords : DE001

@digitalestate
Feature: Digital Estate

Background: User should be on Dashboard page
	When Enter user name as "pankaj.clocr@yopmail.com"
	And click on Proceed button
	And enter correct "Welcome@123"
	And Click on Login button
	
	Scenario Outline: User should navigate to Digital Estate page
		When Click on Digital Estate menu
		Then User should redirects to Your Digital Estate page
		When Click new account button
		Then Creating account page should be open
		When Enter account name "john"
		When Enter account user id "john123"
		When Enter password "Welcome@123"
		When Enter url "www.financial.com"
		When Enter notes "Hi everyone"
		When Click create button
#		Then Account created alert should show
#		When Click on menu button
#		When Click on edit 
#		Then Edit account menu should be open
#		When Click on update button
#		Then Account updated alert should show
    When Click on accounts wizard button
    Then Check list page should be open
    When Click on travel menu
#   When Choose checkbox option
    When Click on save button
    
    

		Examples:
			|url| email | password |
  		|dev.clocr.com | pankaj.clocr@yopmail.com | Welcome@123 |