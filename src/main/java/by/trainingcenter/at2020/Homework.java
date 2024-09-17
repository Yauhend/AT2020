package by.trainingcenter.at2020;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://catalog.onliner.by/");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"userbar\"]/div[2]/div/div/div[1]"));
        login.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input"));
        email.sendKeys("sidneyandtanya@yandex.ru");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input"));
        password.sendKeys("sidsidsid11");
        WebElement enterbutton= driver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button"));
        enterbutton.click();
        Thread.sleep(3000);
        driver.close();
    }
}
