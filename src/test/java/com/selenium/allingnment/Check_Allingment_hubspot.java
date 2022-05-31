package com.selenium.allingnment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.security.Key;

public class Check_Allingment_hubspot {

    /*Using Horizontal and Vertical Location program to validate Username and Password fields on hubSpot
     login page are aligned or not */
    @Test
    public void alinedUNandPWD() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
        WebElement unTB = driver.findElement(By.id("username"));
        WebElement pwdTB = driver.findElement(By.id("password"));
        // get the y-coordinate of username field
        int username_Ycordinate = unTB.getLocation().getY();
        System.out.println("Y Co-ordinate Email :"+ username_Ycordinate);
        // get the y-coordinate of password field
        int password_Ycordinate = pwdTB.getLocation().getY();
        System.out.println("Y Co-ordinate Password :"+password_Ycordinate);
        //check whether the Y-coordinate of username and password field are same
        if (username_Ycordinate==password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
        int username_x_coordinate = unTB.getLocation().getX();
        System.out.println("X Co-ordinate Email :"+ username_x_coordinate);
        int password_Xcordinate = pwdTB.getLocation().getX();
        System.out.println("X Co-ordinate Password :"+password_Xcordinate);
        if(username_x_coordinate==password_Xcordinate){
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
    }
        /* To validate the height and width of Username and
        Password fields on Hubspot login page are same or not */
    @Test
    public void Verify_Height_Width(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
        WebElement unTB = driver.findElement(By.id("username"));
        WebElement pwdTB = driver.findElement(By.id("password"));
        int username_width = unTB.getSize().getWidth();
        int username_height = unTB.getSize().getHeight();
        int password_width = pwdTB.getSize().getWidth();
        int password_height = pwdTB.getSize().getHeight();

        System.out.println("Height Of username Tab :"+ username_height + "\n Height Of Password Tab : " + password_height
                            + "\n Width Of username Tab : "+ username_width+ "\n Width Of Password Tab: "+ password_width);

        if(username_height==password_height && username_width==password_width) {
            System.out.println("Username and password fields are aligned");
        }else {
            System.out.println("Username and password fields are NOT aligned");
        }
    }
        /* How do you remove value present in username text box of Actitime application
         using clear() method*/
    @Test
    public void usingClearMethod() throws InterruptedException {
            System.setProperty("webdriver.edge.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.name("email")).sendKeys("test@rediffmail.com");
            Thread.sleep(2000);
            driver.findElement(By.name("pass")).sendKeys("Test@01");
            Thread.sleep(4000);
            driver.findElement(By.name("email")).clear();
            Thread.sleep(2000);
            driver.findElement(By.name("pass")).clear();
            Thread.sleep(2000);

            /*if there is a space between two words in the username field, we have to use the below lines of
                 code How do you remove value present in username text box of Actitime application without using clear() method*/

           driver.findElement(By.name("email")).sendKeys("delete test2 @rediffmail.com");
            Thread.sleep(2000);
            driver.findElement(By.name("pass")).sendKeys("Delete Test @02");
            Thread.sleep(4000);
            driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"a"+ Keys.DELETE);
            Thread.sleep(2000);
            driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"a"+ Keys.DELETE);
            Thread.sleep(2000);
    }

    /* Using the isSelected() method, it checks whether the checkbox is selected or
        not : if it is already selected, it return true and if not selected, then it returns
        false */

    @Test
    public void checkBox() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement rememberMe_Checkbox = driver.findElement(By.xpath("//i18n-string[contains(text(),'Remember me')]"));
        rememberMe_Checkbox.click();
        Thread.sleep(2000);

        if(rememberMe_Checkbox.isSelected()){
            System.out.println("Checkbox is selected");
        }else{
            System.out.println("Checkbox is NOT selected");
        }
    }
}
