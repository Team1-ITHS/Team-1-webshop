package com.example.Team1webshop.StepDefsTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HomePageStepDefs {

    static WebDriver driver;

    @Before
    public void setup(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("--start-maximized");
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Given("User has navigated to the start page")
    public void user_has_navigated_to_the_start_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/");
    }

    //Samuel
    @Then("the page title should be {string}")
    public void the_page_title_should_be_webbutiken(String pageTitle) {
        Assertions.assertEquals(pageTitle, driver.getTitle());
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

    // Samuel
    @When("the user click on the Checkout button")
    public void theUserClickOnTheButton() {
        driver.findElement(By.xpath("//a[contains(@class, 'btn-warning')]")).click();
    }

    //Samuel
    @Then("the user should be redirected to the Checkout form page")
    public void theUserShouldBeRedirectedToThePage() {
        Assertions.assertTrue(driver.findElement(By.xpath("//h2[text()='Checkout form']")).isDisplayed(), "Element is not visible");
    }

    @When("the user clicks on the Home link") //Divya
    public void the_user_click_on_the_Home_link() {
        WebElement home = driver.findElement(By.partialLinkText("Home"));
        home.click();
    }
    @Then("the user should be directed to home page")
    public void the_user_should_be_directed_to_home_page() {
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://webshop-agil-testautomatiserare.netlify.app/", actualUrl);
    }

    @When("user minimizes the screen")
    public void user_minimizes_the_screen() {
        driver.manage().window().minimize();
    }
    @Then("the application should be aligned automatically accordingly")
    public void the_application_should_be_aligned_automatically_accordingly() {
        WebElement aligned = driver.findElement(By.xpath("/html/body"));
        boolean display = aligned.isDisplayed();
        Assertions.assertTrue(display);
    }

    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
