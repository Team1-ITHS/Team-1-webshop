
Feature:home Page

   Background: testing
     Given I am on the Webbutiken website

   Scenario:I click on Shop button
    When I click on the shop Button from Webbutiken
    Then I should be navigated to Shop page

   Scenario:I filter products by mens clothing
     When I click on the mens clothing from shop page
     Then Only mens clothing must be visible