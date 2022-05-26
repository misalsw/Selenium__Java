package com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;


public class BrowserCompatibility {

    public static void main(String[] args) {
        System.out.println("----Welcome for Selection of Web Browser----");
        BrowserCompatibility browserCompatibility = new BrowserCompatibility();
        int option;
        do {
            option = browserCompatibility.showMainMenu();
            browserCompatibility.handleUserSelection(option);
        } while (option != 4);
    }

    int showMainMenu() {
        System.out.println("Select any one from below options \n1. Press for Chrome Browser" +
                "\n2. Press for Mozilla Browser\n" + "3. Press for Edge Browser\n4. Exit");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        return option;
    }

    void handleUserSelection(int option) {
        switch (option) {
            case 1:
                System.out.println("----Welcome to Chrome Web Browser----");
                System.setProperty( "webdriver.chrome.driver",
                        "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/");
                break;

            case 2:
                System.out.println("----Welcome to Moxilla Fire Fox Web Browser----");
                System.setProperty("webdriver.gecko.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get("https://www.facebook.com/");
                driver.manage().window().maximize();
                break;

            case 3:
                System.out.println("----Welcome to Microsoft Edge Web Browser----");
                System.setProperty("webdriver.edge.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\msedgedriver.exe");
                driver = new EdgeDriver();
                driver.get("https://www.facebook.com/");
                driver.manage().window().maximize();
                break;

            case 4:
                System.out.println("Exited from Console");
                break;

            default:
                System.out.println("Choose Proper Option");
        }
    }
}

