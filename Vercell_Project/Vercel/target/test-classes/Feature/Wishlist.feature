Feature: Wishlist Functionality

  Scenario: User adds an item to the wishlist
    Given User is on the shop page
    When User selects a product
    And User clicks on the "Add to Wishlist" button
    Then The product should be added to the wishlist
