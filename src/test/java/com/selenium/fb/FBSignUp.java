package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FBSignUp {
    @Test
    public void fbSignUp() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Test123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("test@123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("test@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test@1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("7");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("July");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1947");
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(2000);
        driver.close();


    }
}
