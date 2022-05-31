package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumFireFox {
    @Test
        public void viewFromEdge() throws InterruptedException {
            System.setProperty("webdriver.gecko.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.name("email")).sendKeys("testfire@rediffmail.com");
            Thread.sleep(2000);
            driver.findElement(By.name("pass")).sendKeys("Test@01");
            Thread.sleep(10000);

//        driver.close();
        }
    }


