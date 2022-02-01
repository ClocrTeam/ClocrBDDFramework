#Author: Rekha
#Last update: List of scenarios.

@login
Feature: Login functionality

Scenario Outline: Login with valid user name and otp
	Given I open browser
	When I enter email as "pankaj.clocr@yopmail.com"
  When I take the otp from yopmail
  And I enter the otp
  And I enter password as "<password>"
  And I hit login
  Then login should redirect to tutorials page
  	Examples:
      | email | password |
      | pankaj.clocr@yopmail.com | Welcome@123 |