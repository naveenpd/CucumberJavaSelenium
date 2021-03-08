Feature: feature to test login functionality

  Background: Check login is successful
    Given user in the login page
    When user enters the username and password
    And clicks on the login button
    Then navigates to the home page

  Scenario: check logout link
    When user click on the welcome link
    Then logout link is displayed

  Scenario: Verify the quick launch toolbar is displayed
    When user click on dashboard link
    Then quick launch tool bar is displayed
