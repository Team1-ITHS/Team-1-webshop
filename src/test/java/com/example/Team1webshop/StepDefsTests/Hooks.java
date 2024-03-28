package com.example.Team1webshop.StepDefsTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setup() {
        // System.setProperty("webdriver.chrome.driver", "src/test/java/com/example/CucumberSelenium/drivers/chromedriver.exe"); // Provide path to chromedriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
//      options.addArguments("--incognito");
//      options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

