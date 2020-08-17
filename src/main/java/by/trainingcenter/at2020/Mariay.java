package by.trainingcenter.at2020;

        import io.github.bonigarcia.wdm.WebDriverManager;    //при копировании команд ниже эти строки добавляются сами
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class Mariay {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get ("http://6gkb.by/");

        WebElement webElement = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/nav/ul/li[7]/a"));
        webElement.click();

        System.out.println(driver.getTitle());

        WebElement fit = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/nav/ul/li[8]/a"));
        fit.click();

        WebElement asc = driver.findElement(By.xpath("//*[@id=\"adminForm\"]/table/tbody/tr[1]/td/a"));
        asc.click();

        WebElement input = driver.findElement(By.xpath("//*[@id=\"sf2_563_vashe_fio\"]"));
        input.sendKeys("1234");

        WebElement send = driver.findElement(By.xpath("//*[@id=\"simpleForm2_563\"]/div/div[2]/p[2]/input[1]"));
        send.click();
        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());

        //driver.close();
    }

}
