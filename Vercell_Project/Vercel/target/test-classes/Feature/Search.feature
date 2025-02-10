Feature: Search Functionality

  Scenario: User searches for a product
    Given User is on the home page
    When User enters "Air Force Sneakers" in the search box
    And User clicks the search button
    Then A message "No results found for 'Air Force Sneakers'" should be displayed