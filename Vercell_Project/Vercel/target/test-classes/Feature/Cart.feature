Feature: Cart Functionality

  Scenario: User adds an item to the cart
    Given User is on the shop page
    When User selects a product
    And User clicks "ADD TO BAG"
    Then The product should be added to the cart
