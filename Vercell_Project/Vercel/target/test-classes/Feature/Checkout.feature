Feature: Checkout Functionality

  Scenario: User proceeds to checkout
    Given User has items in the cart
    When User clicks on the checkout button
    And User selects the checkout box
    Then User should be redirected to the checkout page
