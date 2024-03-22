Feature: Test cases for shop page

  Background: The user is on the shop page
    Given User has navigated to the shop page

  Scenario:I click on Shop button
    When I click on the shop Button from Webbutiken
    Then I should be navigated to Shop page

  Scenario:I filter products by mens clothing
    When I click on the mens clothing from shop page
    Then Only mens clothing must be visible
