package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumEdge {
    @Test
    public void viewFromEdge() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test@rediffmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Test@01");
        Thread.sleep(10000);

//        driver.close();
    }
}
