#Author: Santosh
#Keywords :

@ecard
Feature: Emergency card

Background: User should be on Dashboard page
	When Enter user name as "natasha.clocr@yopmail.com"
	And click on Proceed button
	And enter correct "Welcome@123"
	And Click on Login button
	
Scenario Outline: User should navigate to emergency card page
		When click on Emergency Card menu
		Then User should redirects to Your Emergency Card page
		When Click on Create your Emergency Card
		When Modify the existing emrgency card
		Then It should redirects to Update Your Emergency Card page
		When Select another "Spain"
		Then Emergency Card Service pop up should open
		When Select Clocr Emergency Card option and Click on Inform Clocr button
#		Then Emergency Card has been updated successfully message should show
		When Click on Pick your Contacts button, select contact and then click on Add button
		Then Contacts should add
		When Click on Back button
		Then After click on Back button it should redirects to Your Emergency Card page
		When Click on Action, click on Download menu for Download Card
		Then Download pop up should open to Download Card
		When Click on Download Card button, then it should download the Card
#		When Click on Action, click on Download menu for Download Sticker
#		Then Download pop up should open to Download Sticker
#		When Click on Download Sticker button, then it should download the Sticker
		When Click on Action, click on Delete menu and click on Yes button
		Then Emergency Card deleted should be deleted
	
	

		Examples:
			| email | password | country |
  		| natasha.clocr@yopmail.com | Welcome@123 | Spain |