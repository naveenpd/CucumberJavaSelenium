Feature: Login into the application
	@smoke
  Scenario Outline: Login successfully using valid credentials
    Given launch the browser
    And user on the login page
    When enter valid <username> and <password>
    And click on the login button
    Then navigates to the main page
    

    Examples: 
      | username | password |
      | Naveen   |    12345 |
      | Priya    |    12345 |
      
  @regression
    Scenario: Test Demo
    Given
    When
    Then
