package com.example.Team1webshop.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


