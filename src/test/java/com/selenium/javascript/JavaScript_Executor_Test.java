package com.selenium.javascript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScript_Executor_Test {
    WebDriver driver = null;

    @BeforeMethod
    public void initialization(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test()
    public void disabledFieldTest() throws InterruptedException {
        driver.get("C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Resources\\disable.html");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);

        javascriptExecutor.executeScript(("document.getElementById('t2'). value = ''"));
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t2'). value = 'manager'");
        javascriptExecutor.executeScript("document.getElementById('t2').type='button'");
        Thread.sleep(2000);

    }

    @Test
    public void scrollBy() throws InterruptedException {
        driver.get("https://www.morningstar.in/default.aspx");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("window.scrollBy(0,250)");

        for (int i = 0; i <= 5; i++) {
            javascriptExecutor.executeScript("window.scrollBy(0,250)");
            Thread.sleep(2000);
        }
    }

    @AfterMethod
    public void closeDriver() throws InterruptedException {
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

}

