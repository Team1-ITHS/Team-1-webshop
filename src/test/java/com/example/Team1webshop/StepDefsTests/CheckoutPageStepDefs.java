package com.example.Team1webshop.StepDefsTests;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutPageStepDefs {


    static WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(1)); // Ange väntetiden här
    }
    //---------------------------------
//Mia
    @Given("User has navigated to the checkout page")
    public void user_has_navigated_to_the_checkout_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/checkout");
    }
    @Then("the pagess title should be {string}")
    public void the_pagess_title_should_be(String expectedTitle) {
        Assertions.assertEquals(expectedTitle, driver.getTitle());
    }

    //---------------------------------
    //Mia
    @Given("User has navigated to the product page")
    public void user_has_navigated_to_the_product_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/products");
    }

    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String buttonLabel) {
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), '" + buttonLabel + "')]")));
        addButton.click();
    }

    @When("User navigates to the checkout page")
    public void user_navigates_to_the_checkout_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/checkout");
    }

    @When("User removes 1 item")
    public void user_removes_1_item() {
        WebElement removeButton = driver.findElement(By.xpath("//button[contains(text(), 'Remove')]"));
        removeButton.click();
    }

    @Then("The item count in the shopping cart should decrease by 1")
    public void the_item_count_in_the_shopping_cart_should_decrease_by_1() {
        WebElement itemCountElement = driver.findElement(By.id("cartSize"));
        int updatedItemCount = Integer.parseInt(itemCountElement.getText());
        Assertions.assertEquals(0, updatedItemCount);
    }
    //---------------------------------

    @Given("Users has navigated to the product page")
    public void users_has_navigated_to_the_product_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/products");
    }

    @When("User clicks on the {string} button {int} times")
    public void user_clicks_on_the_button_multiple_times(String buttonLabel, int times) {
        for (int i = 0; i < times; i++) {
            WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), '" + buttonLabel + "')]")));
            addButton.click();
        }
    }

    @When("Users navigates to the checkout page")
    public void users_navigates_to_the_checkout_page() {
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/checkout");
    }

    @Then("The item count in the shopping cart should be {int}")
    public void the_item_count_in_the_shopping_cart_should_be(int expectedItemCount) {
        WebElement itemCountElement = driver.findElement(By.id("cartSize"));
        int updatedItemCount = Integer.parseInt(itemCountElement.getText());
        Assertions.assertEquals(expectedItemCount, updatedItemCount);
    }
    //---------------------------------

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}