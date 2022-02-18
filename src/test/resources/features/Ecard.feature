#Author: Santosh
#Keywords :

@ecard
Feature: Emergency card

Background: User should be on Dashboard page
	When Enter user name as "check.automation@yopmail.com"
	And click on Proceed button
	And enter correct "Welcome@123"
	And Click on Login button
	
Scenario Outline: User should navigate to emergency card page
		When click on Emergency Card menu
		Then User should redirects to Your Emergency Card page
		When Click on Create your Emergency Card
		Then User should redirects to Create or Register Your Emergency Card page
		When Add details and click on Create Emergency Card button
		Then Emergency Card should generate
		When Modify the existing emrgency card
		Then It should redirects to Update Your Emergency Card page
		When Click on Pick your Contacts button, select contact and then click on Add button
		Then Contacts should add
		When Click on Back button
		Then After click on Back button it should redirects to Your Emergency Card page
		When Click on Action, click on Download menu for Download Card
		Then Download pop up should open to Download Card
		When Click on Download Card button, then it should download the Card
		When Click on Action, click on Download menu for Download Sticker
		When Click on Download Sticker button, then it should download the Sticker
		When User click on Register Your Emergency Card
		Then Register Your Emergency Card page should open
		When User add details like card id "846929920305", country "Slovenia" for register card
		Then User should able to register a card
		When Click on Order New Card link
		Then It should redirects to Order Emergency Cards page
		When Select Not Interested option and click on Close button
		Then User should redirects to Your Emergency Card page after click on Close button
		When Click on click here to recharge
		Then User redirects to Stripe page
		When Enter details and click on Pay button
		When Click on Action, click on Delete menu and click on Yes button
		Then Emergency Card should be deleted
		
		Scenario Outline: Validate add contact and contact details if not added
		When click on Emergency Card menu after to add new contact
		Then It should redirects to Your Emergency Card page
		When Click on Create or Register Your contact link
		Then It should redirects to Create or Register Emergency Card page	
		When click on Pick your contacts button
		Then Choose your contacts for Emergency Card pop up is getting open
		When Click on Add New button
		Then Create page will open
		When Add details and click on Create button
		Then contact should add
		When Select contact and click on Add button
		Then Contact should add on Ecard
		When Click on Create Your Emergency Card button
		Then Added contact should show on card
		
		Examples:
			| email | password | country |
  		| natasha.clocr@yopmail.com | Welcome@123 | Spain |
  		
   
  		