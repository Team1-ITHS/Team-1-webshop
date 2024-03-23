package com.example.Team1webshop.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopPageStepDefs {
    static WebDriver driver;

    @Given("User has navigated to the shop page")
    public void userHasNavigatedToTheShopPage() {
        driver = new FirefoxDriver();
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/products");
        driver.manage().window().maximize();
    }
    @When("user clicks on Add to cart button")
    public void user_clicks_on_add_to_cart_button(){
        driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]")).click();

    }
    @Then("product should be added to the cart")
    public void product_should_be_added_to_the_cart()  {
        driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
        String actualProductTitle= driver.findElement(By.xpath("//*[@class='my-0 w-75']")).getText();
        String expectedProductTitle= "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops";
        Assertions.assertEquals(actualProductTitle,expectedProductTitle);
    }
    @When("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
    }
    @Then("user should be landed to checkout page")
    public void user_should_be_landed_to_checkout_page()  {
        String expectedUrl= "https://webshop-agil-testautomatiserare.netlify.app/checkout";
        String actualUrl =driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);
    }
     @After
   public void tearDown(){
        driver.quit();
    }


}
