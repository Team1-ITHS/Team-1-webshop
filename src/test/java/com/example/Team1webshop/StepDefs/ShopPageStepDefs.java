package com.example.Team1webshop.StepDefs;


import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ShopPageStepDefs {
    static WebDriver driver;

    @Given("User has navigated to the shop page") //divya
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @When("I click on the shop Button from Webbutiken") //divya
    public void I_click_on_the_shop_Button_from_Webbutiken() {
        WebElement shopButton = driver.findElement(By.xpath("/html//header//ul//a[@href='/products']"));
        shopButton.click();
    }
    @Then("I should be navigated to Shop page") //divya
    public void I_should_be_navigated_to_Shop_page() {
        String navigated_url = driver.getCurrentUrl();
        Assertions.assertEquals("https://webshop-agil-testautomatiserare.netlify.app/products",navigated_url);
    }


    @When("I click on the mens clothing from shop page") //divya
    public void i_click_on_the_mens_clothing_from_shop_page() {
        WebElement shopButton = driver.findElement(By.xpath("/html//header//ul//a[@href='/products']"));
        shopButton.click();
        WebElement filterMensClothing = driver.findElement(By.xpath("/html//div[@class='container mt-5']//ul/li[2]/a[@href='#']"));
        filterMensClothing.click();
    }

    @Then("Only mens clothing products must be visible") //divya
    public void only_mens_clothing_products_must_be_visible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mens_clothing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));
        boolean expected_products = mens_clothing.isDisplayed();
        Assertions.assertTrue(expected_products);
    }

}