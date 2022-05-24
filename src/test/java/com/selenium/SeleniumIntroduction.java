package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumIntroduction {
    @Test
        public void introToSelenium() throws InterruptedException {
        System.setProperty(
                    "webdriver.chrome.driver",
                    "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\chromedriver.exe");
            // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
            // Maximize the browser
        driver.manage().window().maximize();
            // Launch Website
        driver.get("https://www.facebook.com/");
        Thread.sleep(100);
        driver.findElement(By.name("email")).sendKeys("test@yahoo.com");
        Thread.sleep(100);
        //driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
        //driver.findElement(By.id("email")).clear();
        driver.findElement(By.name("pass")).sendKeys("Test@123");
//        System.out.println(""+ driver.getTitle() );
//        System.out.println(""+ driver.getCurrentUrl());
        Thread.sleep(100);
//        driver.close();
        }
    }
