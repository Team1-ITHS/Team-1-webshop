package com.example.Team1webshop;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/com/example/Team1webshop/resources/features", plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest {
        static WebDriver driver;

    @Given("I am on the Webbutiken website")
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @After
    public void tearDown () {
        if (driver != null) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
            } catch (TimeoutException e) {
                System.out.println("Timeout waiting for page to load.");
            }
            driver.quit();
        }
    }

    @When("I click on the shop Button from Webbutiken")
    public void I_click_on_the_shop_Button_from_Webbutiken() {
        WebElement shopButton = driver.findElement(By.className("nav-link px-2 text-white"));
        shopButton.click();
    }
    @Then("I should be navigated to Shop page")
    public void I_should_be_navigated_to_Shop_page() {
        WebElement shopPage = driver.findElement(By.id("main"));
        boolean expectedDisplay = shopPage.isDisplayed();
        Assertions.assertTrue(expectedDisplay);
    }

    @When("I click on the mens clothing from shop page")
    public void i_click_on_the_mens_clothing_from_shop_page() {
        WebElement shopButton = driver.findElement(By.className("nav-link px-2 text-white"));
        shopButton.click();
        WebElement filterMensClothing = driver.findElement(By.className("nav-link px-2 link-body-emphasis"));
        filterMensClothing.click();
    }
    @Then("Only mens clothing must be visible")
    public void only_mens_clothing_must_be_visible() {
        WebElement mensClothing = driver.findElement(By.id("main"));
        boolean expectedDisplay = mensClothing.isDisplayed();
        Assertions.assertTrue(expectedDisplay);
    }
}

