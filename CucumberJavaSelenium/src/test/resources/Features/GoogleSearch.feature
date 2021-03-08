Feature: To test the google search

  Scenario: 
    Given browser is open
    And user in the google search page
    When enters the text
    And hits on search button
    Then navigate to the search results
