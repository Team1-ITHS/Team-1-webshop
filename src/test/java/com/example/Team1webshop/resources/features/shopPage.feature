
Feature: Test cases for shop page

  Background: The user is on the shop page
    Given User has navigated to the shop page
    #Semih
    Scenario: User should be able to add product to cart by clicking add to cart button
      When user clicks on Add to cart button
      Then product should be added to the cart
      #Semih
    Scenario: User should be able navigate checkout page by clicking checkout button
      When user clicks on checkout button
      Then user should be landed to checkout page

