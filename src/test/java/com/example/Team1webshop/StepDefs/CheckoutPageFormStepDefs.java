package com.example.Team1webshop.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckoutPageFormStepDefs {
    static WebDriver driver;
    public static void scrollToElement(WebDriver driver, WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(3000);
    }
    @Given("User has navigated to the checkout page")
    public void user_ha_navigated_to_the_checkout_page() {
        driver = new FirefoxDriver();
        driver.get("https://webshop-agil-testautomatiserare.netlify.app/checkout");
        driver.manage().window().maximize();

    }

    @When("user fill out {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_fill_out(String FirstName, String LastName, String Email, String Address, String Country, String City, String Zip, String NameOnCard, String CreditCardNumber, String ExpirationDate, String CVV) throws InterruptedException {
        driver.findElement(By.id("firstName")).sendKeys(FirstName);
        driver.findElement(By.id("lastName")).sendKeys(LastName);
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.id("address")).sendKeys(Address);
        driver.findElement(By.id("country")).sendKeys(Country);
        driver.findElement(By.id("city")).sendKeys(City);
        driver.findElement(By.id("zip")).sendKeys(Zip);
        driver.findElement(By.id("cc-name")).sendKeys(NameOnCard);
        driver.findElement(By.id("cc-number")).sendKeys(CreditCardNumber);
        driver.findElement(By.id("cc-expiration")).sendKeys(ExpirationDate);
        driver.findElement(By.id("cc-cvv")).sendKeys(CVV);

        scrollToElement(driver,driver.findElement(By.xpath("//*[@class='w-100 btn btn-primary btn-lg']")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='w-100 btn btn-primary btn-lg']")).click();



    }
    @Then("a warning message should be seen on in complete filling area in the formpage")
    public void a_warning_message_should_be_seen_on_in_complete_filling_area_in_the_formpage(){

    }
}
