package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitTimeOut {
    @Test
    public void fbSignUp() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2));
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")));
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Test123");
    }

}
