package com.example.Team1webshop.StepDefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopPageStepDefs {

    static WebDriver driver;

    @Before
    @Given("User has navigated to the shop page")
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @When("I click on the shop Button from Webbutiken")
    public void I_click_on_the_shop_Button_from_Webbutiken() {
        WebElement shopButton = driver.findElement(By.xpath("/html//header//ul//a[@href='/products']"));
        shopButton.click();
    }
    @Then("I should be navigated to Shop page")
    public void I_should_be_navigated_to_Shop_page() {
//        WebElement shopPage = driver.findElement(By.xpath("/html/body"));
//        boolean expectedDisplay = shopPage.isDisplayed();
        String navigated_url = driver.getCurrentUrl();
        Assertions.assertEquals("https://webshop-agil-testautomatiserare.netlify.app/products",navigated_url);
    }


    @When("I click on the mens clothing from shop page")
    public void i_click_on_the_mens_clothing_from_shop_page() {
        WebElement shopButton = driver.findElement(By.xpath("/html//header//ul//a[@href='/products']"));
        shopButton.click();
        WebElement filterMensClothing = driver.findElement(By.xpath("/html//div[@class='container mt-5']//ul/li[2]/a[@href='#']"));
        filterMensClothing.click();
    }
    @Then("Only mens clothing must be visible")
    public void only_mens_clothing_must_be_visible() {
        WebElement mensClothing = driver.findElement(By.id("main"));
        boolean expectedDisplay = mensClothing.isDisplayed();
        System.out.println(expectedDisplay);
        Assertions.assertTrue(expectedDisplay);
    }
}