package com.example.Team1webshop.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopPageStepDefs {
    static WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }
    @Given("User has navigated to the shop page")
    public void userHasNavigatedToTheShopPage() {
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
