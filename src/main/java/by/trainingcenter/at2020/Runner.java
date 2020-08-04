package by.trainingcenter.at2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tut.by/");

        List<WebElement> webElements = driver.findElements(By.xpath("//*[@id=\"mainmenu\"]/ul/li/a"));


        for (WebElement e : webElements) {
            String title = e.getAttribute("title");
            System.out.println(title);

        }
        driver.close();

    }
}
