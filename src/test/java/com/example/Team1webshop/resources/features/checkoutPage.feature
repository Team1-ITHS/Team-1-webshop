Feature: https://webshop-agil-testautomatiserare.netlify.app/checkout
  This feature includes tests to verify functionality of the checkout page

  Background: The user is on the checkout page
    Given User has navigated to the checkout page

  Scenario: pagess title test
    Then the pagess title should be "Webbutiken"

    #Mia
  Scenario: Remove an item from the shopping cart
    Given User has navigated to the product page
    When User clicks on the "Add to cart" button
    And User navigates to the checkout page
    And User removes 1 item
    Then The item count in the shopping cart should decrease by 1

    #Mia
  Scenario: Add multiple items to the shopping cart
    Given Users has navigated to the product page
    When User clicks on the "Add to cart" button 5 times
    And Users navigates to the checkout page
    Then The item count in the shopping cart should be 5