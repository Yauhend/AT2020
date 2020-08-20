package by.trainingcenter.at2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clicker {

    public static void clickOn(WebDriver driver, By by) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 500);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            driver.findElement(by).click();
        } catch (Exception e) {
            System.out.println("Element not clickable" + e);
        } finally {
            driver.close();
        }
    }
}
