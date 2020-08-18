package by.trainingcenter.at2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOneJawa {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://21vek.by/");
        WebElement WebElement = driver.findElements(By.xpath(("//*[@id=\"j-navigation\"]/dt[5]/span/span"));
        WebElement.click();
        System.out.println(driver.getTitle());

        WebElement fit = driver.findElements(By.xpath(("//*[@id=\"j-navigation\"]/dd[5]/div/table[1]/tbody/tr/td[1]/dl/dd[11]/a"));
        fit.click();
        System.out.println(driver.getTitle());
    }
     //driver.close();
    }
}
