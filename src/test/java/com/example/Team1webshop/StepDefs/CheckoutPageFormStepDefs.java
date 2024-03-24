package com.example.Team1webshop.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CheckoutPageFormStepDefs {
//
//    static WebDriver driver;
//
//    @Before
//    public void setup() {
//    }
//
//    @Given("user is on the products page")
//    public void user_is_on_products_page() {
//        driver.get("https://webshop-agil-testautomatiserare.netlify.app/products");
//    }
//
//    @Given("add product to cart")
//    public void add_product_to_cart() {
//        driver.findElement(By.xpath("//button[contains(text(), 'Add to cart')]")).click();
//    }
//
//    @Given("click on checkout")
//    public void click_on_checkout() {
//        driver.findElement(By.xpath("//a[contains(@class, 'btn-warning') and contains(text(), 'Checkout')]")).click();
//    }
//
//    @Given("user fills in the form with data {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
//    public void user_fills_in_the_form(String firstName, String lastName, String email, String address, String country, String city, String zipCode, String ccName, String ccNumber, String expDate, String cvv) {
//        driver.findElement(By.id("firstName")).sendKeys(firstName);
//        driver.findElement(By.id("lastName")).sendKeys(lastName);
//        driver.findElement(By.id("email")).sendKeys(email);
//        driver.findElement(By.id("address")).sendKeys(address);
//        driver.findElement(By.id("country")).sendKeys(country);
//        driver.findElement(By.id("city")).sendKeys(city);
//        driver.findElement(By.id("zip")).sendKeys(zipCode);
//        driver.findElement(By.id("cc-name")).sendKeys(ccName);
//        driver.findElement(By.id("cc-number")).sendKeys(ccNumber);
//        driver.findElement(By.id("cc-expiration")).sendKeys(expDate);
//        driver.findElement(By.id("cc-cvv")).sendKeys(cvv);
//    }
//
//    @When("user click on continue to checkout")
//    public void user_click_on_continue_to_checkout() {
//        driver.findElement(By.xpath("//button[contains(text(), 'Continue to checkout')]")).click();
//    }
//
//    @Then("user should get an error message")
//    public void user_should_get_an_error_message() {
//        String errorMessage = driver.findElement(By.xpath("//div[@class='invalid-feedback' and contains(text(), 'Please')]")).getText();
//        Assertions.assertEquals("Please enter a valid email address for shipping updates.", errorMessage);
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}

