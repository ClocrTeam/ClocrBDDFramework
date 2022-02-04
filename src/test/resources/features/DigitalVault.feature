#Author: Amal Santhosh
#Keywords : DV001

@digitalvault
Feature: Digital Vault

Background: User should be on Dashboard page
	When Enter user name as "pankaj.clocr@yopmail.com"
	And click on Proceed button
	And enter correct "Welcome@123"
	And Click on Login button
	
Scenario Outline: User should navigate to Digital Vault page
		When Click on Digital Vault menu
		Then User should redirects to Digital Vault page
		When Create folder new folder "new_folder"
		Then Delete folder new folder "new_folder"
		When Rename My Kids folder to "rename_folder"
		Then Rollback to My Kids folder "My Kids"
#		When Upload documents to ID documents folder
#		Then Add Notes to ID documents folder "note"
#		When Share ID documents folder
#		Then UnShare ID documents folder

		Examples:
			| email | password |
  		| pankaj.clocr@yopmail.com | Welcome@123 |