#Author: Amal Santhosh
#Keywords : DV001

@digitalvault
Feature: Digital Vault

Background: User should be on Dashboard page
	Given Browser should be open and user should be 'dev.clocr.com' site
	When Enter user name as "pankaj.clocr@yopmail.com"
	And click on Proceed button
	And enter correct "Welcome@123"
	And Click on Login button
	
Scenario Outline: User should navigate to Digital Vault page
		When Click on Digital Vault menu
		Then User should redirects to Digital Vault page
		When Click Create folder button
		Then Creating folder popup should be open
		When Choose root option
		When Enter name of the folder "awerwd1243"
		When Click Create button
		Then Folder created alert should show
		When Click on Edit folder
		Then Edit menu should open
		When Click on Rename 
		Then Rename my folder pop up should open
		When Rename name of the folder "renamed_folder"
##	Then Rename folder alert should show
		When Click on My Docs icon
		Then Open expanded My Docs folders
		When Click on Edit of ID documents folder
		Then ID documents edit menu should open
		When Click on upload document of ID documents
		Then Add document pop up should open
		When Click on Browse of ID documents
		When Click on Edit of ID documents folder for notes
		Then ID documents edit menu should open for notes
		When Click on Notes of ID documents folder
		Then Notes pop up should open
		When Enter notes as "this is a note"
		Then Notes updated alert should show
		When Click on Digital Vault menu
		When Click on My Docs icon
		Then Open expanded My Docs folders
		When Click on Edit of ID documents folder
		Then ID documents edit menu should open
		When Click on Share document of ID documents	
		
#		When Click on Dashboard icon
#		Then User should redirects to Dashboard page
		Then Close the browser

		Examples:
			|url| email | password |
  		|dev.clocr.com | pankaj.clocr@yopmail.com | Welcome@123 |