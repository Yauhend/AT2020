package KinoGo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
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
           driver.close();

       }
}
