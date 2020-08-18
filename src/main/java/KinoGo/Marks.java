package KinoGo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marks {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://kinogo.by/");
        Thread.sleep(2000);
        WebElement loginbutton = driver.findElement(By.cssSelector("body > div.wrapper > div.header > div.header44 > div.user_panel > div.loginin > a:nth-child(3)"));
        loginbutton.click();
        WebElement loginenter=driver.findElement(By.xpath("//*[@id=\"login_name\"]"));
        loginenter.sendKeys("Ryuko");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("//*[@id=\"login_password\"]"));
        password.sendKeys("zxpo22");
        Thread.sleep(2000);
        WebElement enterbutton=driver.findElement(By.xpath("//*[@id=\"test\"]/form/button/span"));
        enterbutton.click();
        Thread.sleep(2000);

        WebElement search=driver.findElement(By.xpath("//*[@id=\"story\"]"));
        search.sendKeys("Соник в кино");
        Thread.sleep(2000);
        WebElement searchbutton=driver.findElement(By.cssSelector("body > div.wrapper > div.header > div.header44 > div.search_panel > span > form > button"));
        searchbutton.click();
        Thread.sleep(2000);
        WebElement film=driver.findElement(By.xpath("//*[@id=\"dle-content\"]/div[4]/div[1]/h2/a[2]"));
        film.click();
        Thread.sleep(2000);
        WebElement addmark=driver.findElement(By.xpath("//*[@id=\"fav-id-23699\"]/img"));
        addmark.click();
        Thread.sleep(2000);
        WebElement markpage =driver.findElement(By.cssSelector("body > div.wrapper > div > div.header > div.header44 > div.user_panel > div > a:nth-child(3)"));
        markpage.click();
        Thread.sleep(2000);
        driver.close();
    }
}
