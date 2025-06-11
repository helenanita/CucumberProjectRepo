Feature: Swag Lab application
Scenario: User log in to the Application
scenario outline :


Given User in website url Swag Lab
Given User enter username as "standard_user" and password as "secret_sauce"
When User clicks the login button 
And Login should happen
