Feature: Check Login Functionality
	@smoke
  Scenario: 
    Given User is on the login page
    When user enters valid username and password
    And click on the login button
    Then user navigates to the home page
