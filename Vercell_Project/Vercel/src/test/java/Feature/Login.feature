Feature: Login Functionality

  Scenario: User logs in with valid credentials
    Given User is on the login page
    When User enters valid email "test@example.com" and password "password123"
    And User clicks on the login button
    Then User should be redirected to the home page
