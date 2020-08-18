package by.trainingcenter.at2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) {

        WebDriver driver = WebDriverSingleton.getDriver();

        driver.get("https://www.tut.by/");

        List<WebElement> webElements = driver.findElements(By.xpath("//*[@id=\"mainmenu\"]/ul/li/a"));


        for (WebElement e : webElements) {
            String title = e.getAttribute("title");
            System.out.println(title);

        }
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 500);

        driver.navigate().refresh();
        Clicker.clickOn(driver, By.xpath("//*[@id=\"mainmenu\"]/ul/li/a"));
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(1, TimeUnit.DAYS);

    }
}
