Feature: https://webshop-agil-testautomatiserare.netlify.app/
  This feature includes tests to verify functionality of the start page

  Background: The user is on the start page
    Given User has navigated to the start page

  Scenario: page title test
    Then the page title should be Webbutiken