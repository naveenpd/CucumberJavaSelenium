Feature: feature to test login functionality
	@smoketest
  Scenario: Check login is successful
    Given user in the login page
    When user enters the username and password
    And clicks on the login button
    Then navigates to the home page
