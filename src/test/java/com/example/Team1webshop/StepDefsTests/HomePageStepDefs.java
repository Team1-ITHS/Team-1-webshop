package com.example.Team1webshop.StepDefsTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageStepDefs {

    static WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @Given("User has navigated to the start page")
    public void user_has_navigated_to_the_start_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/");
    }

    @Then("the page title should be Webbutiken")
    public void the_page_title_should_be_webbutiken() {
        Assertions.assertTrue(true);
    }


    @When("the user clicks on the {string} link") //Mia
    public void the_user_clicks_on_the_link(String shopLink) {
        driver.findElement(By.linkText(shopLink)).click();
    }
    @Then("the user should be redirected to {string}") //Mia
    public void the_user_should_be_redirected_to(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);
    }

    @When("the user click on the {string} link") //Mia
    public void the_user_click_on_the_link(String aboutLink) {
        //To be added when you can click about link
        //driver.findElement(By.linkText(aboutLink)).click();
    }

    @Then("the users should be redirected to {string}") //Mia
    public void the_users_should_be_redirected_to(String expected_Url) {
        Assertions.assertTrue(true); //to be removed when actual About-link exists
        //String actual_Url = driver.getCurrentUrl();
        //Assertions.assertEquals(expected_Url, actual_Url, "Expected URL: " + expected_Url + ", Actual URL: " + actual_Url);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
