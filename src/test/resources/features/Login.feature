#Author: Rekha
#Last update: List of scenarios.

@login
Feature: Login functionality

Scenario Outline: Login with valid user name and valid password
	When Enter user name as "<email>"
	And click on Proceed button
	And enter correct "<password>"
	And Click on Login button 
  Examples:
      | email | password |
      | pankaj.clocr@yopmail.com | Welcome@123 |