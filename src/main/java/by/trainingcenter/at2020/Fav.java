package by.trainingcenter.at2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Fav {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.onliner.by/");
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[1]/a/span"));
        webElement.click();
        System.out.println(driver.getTitle());

        WebElement baner = driver.findElement(By.xpath("//*[@id=\"widget-18\"]/div/a/span[1]"));
        baner.click();
        WebElement telephone =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div[3]/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/div/div[1]/div/div[2]/div[1]/a"));
       telephone.click();
       List<String> tabs= new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));
        WebElement favorite = driver.findElement(By.cssSelector(".i-checkbox_yellow > .i-checkbox__faux"));
        favorite.click();
        WebElement FavPage =driver.findElement(By.xpath("//*[@id=\"compare-button-container\"]/div/div[1]/div/div/div[1]/a[2]"));
        FavPage.click();
        driver.close();
    }
}
