Feature: https://webshop-agil-testautomatiserare.netlify.app/
  This feature includes tests to verify functionality of the start page

  Background: The user is on the start page
    Given User has navigated to the start page

  Scenario: page title test
    Then the page title should be Webbutiken

    #Mia
  Scenario: Click on the Shop link
    When the user clicks on the "Shop" link
    Then the user should be redirected to "https://webshop-agil-testautomatiserare.netlify.app/products"

    #Mia
  Scenario: Click on the About link
    When the user click on the "About" link
    Then the users should be redirected to "https://webshop-agil-testautomatiserare.netlify.app/#"
    #when About-site is available change to row below
    #Then the users should be redirected to "https://webshop-agil-testautomatiserare.netlify.app/about"
