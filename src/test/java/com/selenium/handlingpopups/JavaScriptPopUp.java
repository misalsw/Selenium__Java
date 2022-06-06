package com.selenium.popups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class JavaScriptPopUp {
    WebDriver driver = null;

    @BeforeMethod
    public void initialization() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void alert_popUp() throws InterruptedException {
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Swapnil");
        Thread.sleep(2000);
        alert.accept();
        //To click on Cancel Perform below Operation
//        System.out.println(alert.getText());
//        alert.dismiss();
    }

    @Test
    public void alert_Promptpopup() throws InterruptedException {
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Swapnil");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.dismiss();
    }

    @Test
    public void hiddenDivisionPopup() throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        WebDriver driver = new ChromeDriver(option);
        option.addArguments("--disable-notifications");
        option.addArguments("--disable-geolocation");
        option.addArguments("--ignore-certificate-errors");
        driver.get("https://www.naukri.com/browse-jobs");
        Thread.sleep(10000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
//        System.out.println(alert.getText());
//        Thread.sleep(2000);
//        alert.accept();
        Thread.sleep(3000);
    }

    @Test
    public void hiddenPopUp() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("test@rediffmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Test@01");
        Thread.sleep(2000);
        driver.findElement(By.name(("login"))).submit();
    }

    @Test
    public void fileUploadPopUp() throws InterruptedException {
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[1]")).
                sendKeys("C:\\Users\\Swapnil Misal\\Desktop\\Testing\\html.txt");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-success btn-s']")).click();
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void fileDownload() throws InterruptedException {
        driver.get("http://www.seleniumhq.org/download/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("4.2.1")).click();
        Thread.sleep(3000);
    }

    @Test
    public void childBrowserPopup() throws InterruptedException {
        driver.get("https://www.naukri.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//li[1]//a[1]//div[1]")).click();
        Thread.sleep(4000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Thread.sleep(4000);
        int count = allWindowHandles.size();
        Thread.sleep(4000);
        System.out.println("Number of browser windows opened on the system is : " + count);
        Thread.sleep(4000);
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
        }
    }

    @Test
    public void closeMainBrowserOnly() throws InterruptedException {
        driver.get("https://www.naukri.com/");
        String parentWindowhandleID = driver.getWindowHandle();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//li[1]//a[1]//div[1]")).click();
        Thread.sleep(4000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Thread.sleep(4000);
        int count = allWindowHandles.size();
        Thread.sleep(4000);
        System.out.println("Number of browser windows opened on the system is : " + count);
        Thread.sleep(4000);
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            if (windowHandle.equals(parentWindowhandleID)) {
                driver.close();
                System.out.println("Main Browser window with title -->" + title + " --> is closed");
            }
        }
    }

    @Test
    public void fileUploadPopUpAutoit() throws InterruptedException, IOException {
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//body[@class='ng-scope']/div[@class='container']/div[@class='row']/div[2]")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Swapnil Misal\\Desktop\\Testing\\Sample\\File1.exe");
        Thread.sleep(4000);
    }

    @Test
    public void fileUploadsAutoit() throws InterruptedException, IOException {
        driver.get("http://demo.guru99.com/test/autoit.html");
        driver.findElement(By.id("postjob")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("input_3")).sendKeys("Swapnil");
        //ElementNotInteractableException
//        driver.findElement(By.id("id_4")).sendKeys("test.test@gmail.com");
//        driver.findElement(By.id("input_4")).click();
//        // below line execute the AutoIT script .
//        Runtime.getRuntime().exec("C:\\Users\\Swapnil Misal\\Desktop\\Testing\\Sample\\FileUpload.exe");
//        driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");
//        driver.findElement(By.id("input_2")).click();
        driver.close();
    }

    @Test
    public void autoITFileUpload() throws InterruptedException, IOException {

        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
        Thread.sleep(3000);

        Runtime runtime = Runtime.getRuntime();
        runtime.exec("C:\\Users\\Swapnil Misal\\Desktop\\Testing\\Sample\\File1.exe");

    }

    @AfterMethod
    public void closeDriver() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}


