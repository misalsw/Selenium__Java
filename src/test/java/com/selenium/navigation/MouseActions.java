package com.selenium.navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MouseActions {
    @Test
    public void facebook() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        robot.mouseWheel(KeyEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseWheel(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseMove(364,52); //Exact Co-Ordinates to visit on Username section
        WebElement createNewAc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(createNewAc).build().perform();
        actions.contextClick(createNewAc).build().perform(); // Used To Right Click
        // Perform double-click action on the element
        actions.doubleClick(createNewAc).build().perform();
        // Performs drag and drop action of sourceEle onto the targetEle
//        WebElement sourceEle = driver.findElement(By.id("draggable"));
//        // Store 'box B' as source element
//        WebElement targetEle = driver.findElement(By.id("droppable"));
//        actions.dragAndDrop(sourceEle, targetEle).build().perform();

    }

}
