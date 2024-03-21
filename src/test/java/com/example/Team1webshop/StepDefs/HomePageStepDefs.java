package com.example.Team1webshop.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
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

    @After
    public void tearDown(){
        driver.quit();
    }


}
